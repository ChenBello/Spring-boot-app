# Use the official FastAPI/uvicorn image
FROM tiangolo/uvicorn-gunicorn-fastapi:python3.8

# Set the working directory
WORKDIR /app

# Copy the application code into the container
COPY . .

# Expose the FastAPI server port
EXPOSE 8001

# Start the FastAPI application
CMD ["uvicorn", "main:app", "--host", "0.0.0.0", "--port", "8001"]
