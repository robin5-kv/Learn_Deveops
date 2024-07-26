
# Define the JSON structure
a ={
    'TerminatingInstances': [
        {
            'CurrentState': {
                'Code': 123,
                'Name': 'pending'
            },
            'InstanceId': 'string',
            'PreviousState': {
                'Code': 123,
                'Name': 'pending'
            }
        },
        {
            'test': {
                'Code': 123,
                'Name': 'pending'
            },
            'InstanceId': 'string',
            'PreviousState': {
                'Code': 123,
                'Name': 'pending'
            }
        }
    ]
}

# Loop through the TerminatingInstances list
# for instance in a['TerminatingInstances']:
#     # Check if the 'name' key exists
#     if 'name' in instance:
#         # Access the elements in the 'name' dictionary
#         name_value = instance['name']['value']
#         name_value2 = instance['name']['value2']
#
#         # Print the accessed elements
#         print(f"Name Value: {name_value}")
#         print(f"Name Value2: {name_value2}")

# for terminating in a['ResponseMetadata']:
#     name= print(f"value is {terminating['name']['value2']}")
# Rule 2

# for terminate in a['TerminatingInstances']:
#     name= print(f"value {terminate['name']['value']}")


#value with mutiple Dictonary in  List
#rule to be follwed default n number of list == n number of for loop
#Rule for dictonary in a list one for loop and key = value
#Rule for mutiple dictonary in a list for loop and if condition with ,because list does not have a name key, which leads to the KeyError ey exists in each dictionary before trying to access it.
# Here’s how you can modify your code to avoid the KeyError

# Rule 3
for t in a["TerminatingInstances"]:
    if 'test' in t:
     value = print(f"value is {t['PreviousState']['Name']}")

