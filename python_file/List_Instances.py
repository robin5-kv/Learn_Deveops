import boto3
import json
def delete_instance():
    #fetch all instances
    client = boto3.client('ec2')
    instance_response = client.describe_instances( Filters=[
        {
            'Name': 'instance-state-name',
            'Values': [
                'running',
            ]
        },
    ],)
    instances_id = set()
    delete_instance = set()
    for reservation in instance_response['Reservations']:

      for instances in reservation['Instances']:
          instances_id.add(instances['InstanceId'])
          print(instances_id)
    instances_list= list(instances_id)
    print(instances_list)
    a=len(instances_list)
    #Condition Check
    if(a>0):
        delete_response = client.terminate_instances(InstanceIds=instances_list)
        for terminate_instances in delete_response['TerminatingInstances']:
            delete_instance.add(terminate_instances['Name'])
            print(f"instance id state {delete_instance}")
    else:
        print("No active instaces is running currently")







delete_instance()






# if (len(instances_list) > 0):
#     delete_response = client.terminate_instances(
#         InstanceIds=[
#             instances_list
#         ],
#     )
#     for terminate_instances in delete_response['TerminatingInstances']:
#         for current_State_instance in terminate_instances['CurrentState']:
#             delete_instance.add(current_State_instance['Name'])
#             print(f"instance id state {delete_instance}")
# else:
#     print("No active instaces is running curently")
#
#     #Instance_id= (instance_response["Reservations"][0]["Instances"][0]["InstanceId"])
# # print(type(Instance_id))
# # print(Instance_id)
#
#     for reservations in instance_response['Reservations']:
#
#         for instances in reservations['Instances']:
#             instances_id.add(instances['InstanceId'])
#             print(instances_id)
#
