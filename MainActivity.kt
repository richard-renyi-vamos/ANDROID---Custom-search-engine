import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the spinner with search engine options
        val searchEngines = listOf("Google", "YouTube", "Wikipedia")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, searchEngines)
        searchEngineSpinner.adapter = adapter

        // Handle search button click
        searchButton.setOnClickListener {
            val query = searchEditText.text.toString()
            val selectedEngine = searchEngineSpinner.selectedItem.toString()
            performSearch(query, selectedEngine)
        }
    }

    private fun performSearch(query: String, searchEngine: String) {
        // Depending on the selected search engine, you should implement the search logic here
        when (searchEngine) {
            "Google" -> {
                // Perform a Google search
                // You'd make an HTTP request to Google's search API
            }
            "YouTube" -> {
                // Perform a YouTube search
                // You'd make an HTTP request to YouTube's search API
            }
            "Wikipedia" -> {
                // Perform a Wikipedia search
                // You'd make an HTTP request to Wikipedia's search API
            }
        }

        // Display search results or handle them as needed
    }
}
