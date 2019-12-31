package com.eivier.nutritionalapp.ui.login

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import androidx.core.widget.NestedScrollView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import android.view.View
import android.widget.Toast
import com.eivier.nutritionalapp.MainActivity

import com.eivier.nutritionalapp.R
import com.eivier.nutritionalapp.SignUp
import com.eivier.nutritionalapp.tools.InputValidation
import com.eivier.nutritionalapp.sql.DatabaseHelper


class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private val activity = this@LoginActivity

    private lateinit var nestedScrollView: NestedScrollView

    private lateinit var textInputLayoutEmail: TextInputLayout
    private lateinit var textInputLayoutPassword: TextInputLayout

    private lateinit var textInputEditTextEmail: TextInputEditText
    private lateinit var textInputEditTextPassword: TextInputEditText

    private lateinit var appCompatButtonLogin: AppCompatButton

    private lateinit var textViewLinkRegister: AppCompatTextView

    private lateinit var inputValidation: InputValidation
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // hiding the action bar
        //supportActionBar!!.hide()

        // initializing the views
        initViews()

        // initializing the listeners
        initListeners()

        // initializing the objects
        initObjects()
    }

    /**
     * This method is to initialize views
     * Este metodo sirve para inicializar las vistas
     */
    private fun initViews() {
        nestedScrollView = findViewById<View>(R.id.nestedScrollView) as NestedScrollView
        textInputLayoutEmail = findViewById<View>(R.id.textInputLayoutEmail) as TextInputLayout
        textInputLayoutPassword = findViewById<View>(R.id.textInputLayoutPassword) as TextInputLayout
        textInputEditTextEmail = findViewById<View>(R.id.textInputEditTextEmail) as TextInputEditText
        textInputEditTextPassword = findViewById<View>(R.id.textInputEditTextPassword) as TextInputEditText
        appCompatButtonLogin = findViewById<View>(R.id.appCompatButtonLogin) as AppCompatButton
        textViewLinkRegister = findViewById<View>(R.id.textViewLinkRegister) as AppCompatTextView
    }

    /**
     * This method is to initialize listeners
     * Este metodo sirve para inicializar los "escucha"
     */
    private fun initListeners() {
        appCompatButtonLogin.setOnClickListener(this)
        textViewLinkRegister.setOnClickListener(this)
    }

    /**
     * This method is to initialize objects to be used
     * Este metodo sirve para inicializar los objetos a ser usados
     */
    private fun initObjects() {
        databaseHelper = DatabaseHelper(activity)
        inputValidation = InputValidation(activity)
    }

    /**
     * This implemented method is to listen the click on view
     * Este metodo implemento el "escucha" al dar click; registrar un usuario
     *
     * @param v
     */
    override fun onClick(v: View) {
        when (v.id) {
            R.id.appCompatButtonLogin -> verifyFromSQLite()
            R.id.textViewLinkRegister -> {
                // Navigate to RegisterActivity
                val intentRegister = Intent(applicationContext, SignUp::class.java)
                startActivity(intentRegister)
            }
        }
    }

    /**
     * This method is to validate the input text fields and verify login credentials from SQLite
     */
    private fun verifyFromSQLite() {
        if (!inputValidation.isInputEditTextEmail(
                textInputEditTextEmail,
                textInputLayoutEmail, getString(R.string.error_message_email))) {
            return
        }
        if (!inputValidation.isInputEditTextFilled(
                textInputEditTextPassword,
                textInputLayoutPassword, getString(R.string.error_message_nopassword))) {
            return
        }
        if (databaseHelper.checkUser(textInputEditTextEmail.text.toString().trim { it <= ' ' }, textInputEditTextPassword.text.toString().trim { it <= ' ' })) {
            val accountsIntent = Intent(activity, MainActivity::class.java)
            accountsIntent.putExtra("EMAIL", textInputEditTextEmail.text.toString().trim { it <= ' ' })
            emptyInputEditText()
            startActivity(accountsIntent)
            finish()
        } else {
            // Snack Bar to show success message that record is wrong, change to Toast
            Toast.makeText(this,R.string.error_valid_email_password, Toast.LENGTH_LONG).show()
            //Snackbar.make(nestedScrollView, getString(R.string.error_valid_email_password), Snackbar.LENGTH_LONG).show()
        }
    }

    /**
     * This method is to empty all input edit text
     */
    private fun emptyInputEditText() {
        textInputEditTextEmail.text = null
        textInputEditTextPassword.text = null
    }
}
