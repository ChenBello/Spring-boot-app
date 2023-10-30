from fastapi import FastAPI
import requests

# Create a FastAPI app
app = FastAPI()


# Define a route for running tests against the Spring Boot server
@app.get("/test-logging")
async def run_tests():
    # You can call your Python tests here
    # For example, you can use the 'requests' library to interact with the Spring Boot server and validate responses
    # Then, return the test results as a response
    test_results = run_tests_with_requests()
    return {"message": "Tests executed successfully", "results": test_results}


def run_tests_with_requests():
    # Define the base URL of your Spring Boot server
    base_url = "http://localhost:8080"

    test_results = {}

    # Test the "getAllLogEntries" endpoint
    response = requests.get(f"{base_url}/logs/entries")
    test_results["getAllLogEntries"] = {
        "status_code": response.status_code,
        "content": response.json(),
    }

    # Test the "createLogEntry" endpoint
    create_log_entry_data = {"route": "test_route"}
    response = requests.post(f"{base_url}/logs/create", json=create_log_entry_data)
    test_results["createLogEntry"] = {
        "status_code": response.status_code,
        "content": response.json(),
    }

    return test_results


if __name__ == "__main__":
    import uvicorn

    uvicorn.run(app, host="0.0.0.0", port=8001)
