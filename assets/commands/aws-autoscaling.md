# TAGLINE

Automatically scale EC2 instance groups based on demand

# TLDR

**Create an Auto Scaling group** with a launch template

```aws autoscaling create-auto-scaling-group --auto-scaling-group-name [my-asg] --launch-template LaunchTemplateId=[lt-12345] --min-size [1] --max-size [5] --vpc-zone-identifier "[subnet-abc,subnet-def]"```

**List Auto Scaling groups**

```aws autoscaling describe-auto-scaling-groups```

**Update group capacity**

```aws autoscaling update-auto-scaling-group --auto-scaling-group-name [my-asg] --desired-capacity [3]```

**Set scaling policy** (target tracking)

```aws autoscaling put-scaling-policy --auto-scaling-group-name [my-asg] --policy-name [cpu-policy] --policy-type TargetTrackingScaling --target-tracking-configuration file://[config.json]```

**Describe instances** in a group

```aws autoscaling describe-auto-scaling-instances```

**Attach a load balancer** target group

```aws autoscaling attach-load-balancer-target-groups --auto-scaling-group-name [my-asg] --target-group-arns [arn:aws:elasticloadbalancing:...]```

**Delete an Auto Scaling group**

```aws autoscaling delete-auto-scaling-group --auto-scaling-group-name [my-asg] --force-delete```

# SYNOPSIS

**aws autoscaling** _command_ [_options_]

# PARAMETERS

**create-auto-scaling-group**
> Create a new Auto Scaling group

**describe-auto-scaling-groups**
> List Auto Scaling groups and their configuration

**update-auto-scaling-group**
> Modify group settings (capacity, health checks, etc.)

**delete-auto-scaling-group**
> Delete an Auto Scaling group

**put-scaling-policy**
> Create or update a scaling policy

**describe-scaling-activities**
> View scaling activity history

**set-desired-capacity**
> Set the desired number of instances

**attach-load-balancer-target-groups**
> Attach target groups to the group

**create-launch-configuration**
> Create a launch configuration (legacy)

**--auto-scaling-group-name** _name_
> Name of the Auto Scaling group

**--launch-template** _spec_
> Launch template ID or name and version

**--min-size** _n_
> Minimum number of instances

**--max-size** _n_
> Maximum number of instances

**--desired-capacity** _n_
> Desired number of instances

**--vpc-zone-identifier** _subnets_
> Comma-separated subnet IDs

**--health-check-type** _type_
> EC2 or ELB health check type

**--health-check-grace-period** _seconds_
> Seconds before health checks start

**--force-delete**
> Delete even with running instances

# DESCRIPTION

**aws autoscaling** manages Amazon EC2 Auto Scaling groups that automatically adjust the number of EC2 instances based on demand or schedules. Groups maintain application availability and allow automatic scaling up during demand spikes and scaling down to reduce costs.

Launch templates or launch configurations define instance settings (AMI, instance type, security groups). Scaling policies determine when and how to scale based on metrics like CPU utilization or request count.

**Target tracking scaling** maintains a specific metric value (e.g., 50% CPU). **Step scaling** adjusts capacity in steps based on alarm thresholds. **Scheduled scaling** changes capacity at specified times.

Health checks (EC2 or ELB) detect unhealthy instances for automatic replacement. The **health-check-grace-period** prevents premature termination of instances still initializing.

# CAVEATS

Launch templates are recommended over legacy launch configurations. Deleting a group with running instances requires **--force-delete**. Scaling activities have rate limits. Instances may take time to become healthy, affecting scaling responsiveness.

# HISTORY

**Amazon EC2 Auto Scaling** launched in **May 2009** as one of AWS's earliest services for elastic compute capacity. Originally using launch configurations, AWS introduced launch templates in **2017** for more flexibility. The service has expanded to support mixed instance types, predictive scaling, and warm pools for faster scaling.

# SEE ALSO

[aws](/man/aws)(1), [aws-ec2](/man/aws-ec2)(1), [aws-elbv2](/man/aws-elbv2)(1), [aws-cloudwatch](/man/aws-cloudwatch)(1)
