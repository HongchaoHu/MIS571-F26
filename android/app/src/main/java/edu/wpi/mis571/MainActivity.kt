package edu.wpi.mis571

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import edu.wpi.mis571.data.AppDatabase

class MainActivity : Activity() {
    private lateinit var database: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        database = AppDatabase(this)
        database.writableDatabase

        setContentView(
            TextView(this).apply {
                text = getString(R.string.starter_message)
                textSize = 20f
                setPadding(32, 32, 32, 32)
            },
        )
    }

    override fun onDestroy() {
        database.close()
        super.onDestroy()
    }
}
