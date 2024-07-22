#/usr/bin/python3

import multiprocessing
import time

# Function to simulate a CPU-intensive task
def cpu_intensive_task():
    while True:
        [x ** 2 for x in range(10 ** 6)]  # Simulating a computational task
#the above computational task will create square of range 0,9,99,999 in the list
#This will type of execution computational task is called comperhensive task
# Main function to increase CPU load
def increase_cpu_load():
    # Create a process to run the CPU-intensive task
    process = multiprocessing.Process(target=cpu_intensive_task)
    process.start()

    # Let the task run for some time (you can adjust as needed)
    time.sleep(30)  # Increase CPU load for 30 seconds

    # Terminate the process to stop increasing CPU load
    process.terminate()
    process.join()

    print("CPU load increase stopped.")

if __name__ == "__main__":
    print("Increasing CPU load...")
    increase_cpu_load()

