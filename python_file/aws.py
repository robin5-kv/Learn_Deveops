import boto3
client = boto3.client('ec2')
response = client.run_instances(
    BlockDeviceMappings=[
        {
            'DeviceName': '/dev/xvda',
            'Ebs': {
                'DeleteOnTermination': True,
                'Iops': 3000,
                'SnapshotId': 'snap-04b253b6c4eb24c47',
                'VolumeSize': 123,
                'VolumeType': 'gp3',
                'Throughput': 125,
                'Encrypted': False
            },
        },
    ],
    ImageId='ami-04a81a99f5ec58529',
    InstanceType='t2.micro',
    KeyName='Tese_dev',
    MaxCount=1,
    MinCount=1,
    Monitoring={
        'Enabled': False
    },
    SecurityGroupIds=[
        'sg-0b26130a294706f52',
    ],
    SubnetId='subnet-04ef628c5a522d2a6',
    InstanceInitiatedShutdownBehavior='terminate',
)



print(response["Instances"][0]["InstanceID"])



