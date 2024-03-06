import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.example.firebaseweek05.MainActivity3
import com.example.firebaseweek05.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set onClickListener for the next button
        binding.nextBtn.setOnClickListener {
            // Your onClickListener logic goes here
           startActivity(Intent(this, MainActivity3::class.java))
        }
    }

    }
