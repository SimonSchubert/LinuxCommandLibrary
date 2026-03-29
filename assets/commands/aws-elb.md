# TAGLINE

Manage Classic Load Balancers

# TLDR

**List all Classic Load Balancers**

```aws elb describe-load-balancers```

**Describe a specific load balancer**

```aws elb describe-load-balancers --load-balancer-names [lb_name]```

**Check the health** of registered instances

```aws elb describe-instance-health --load-balancer-name [lb_name]```

**Register an instance** with a load balancer

```aws elb register-instances-with-load-balancer --load-balancer-name [lb_name] --instances [i-xxxxxxxx]```

**Deregister an instance** from a load balancer

```aws elb deregister-instances-from-load-balancer --load-balancer-name [lb_name] --instances [i-xxxxxxxx]```

**Create a Classic Load Balancer**

```aws elb create-load-balancer --load-balancer-name [lb_name] --listeners Protocol=HTTP,LoadBalancerPort=80,InstanceProtocol=HTTP,InstancePort=80 --subnets [subnet-id] --security-groups [sg-id]```

**Delete a load balancer**

```aws elb delete-load-balancer --load-balancer-name [lb_name]```

# SYNOPSIS

**aws elb** _subcommand_ [_options_]

# DESCRIPTION

**aws elb** is a subcommand of the AWS CLI that manages Classic Load Balancers (CLB), the original Elastic Load Balancing service. Classic Load Balancers distribute incoming traffic across multiple EC2 instances in one or more Availability Zones.

CLB operates at both Layer 4 (TCP) and Layer 7 (HTTP/HTTPS), routing traffic based on application or network level information. It performs health checks on registered instances and only routes traffic to healthy targets.

Classic Load Balancers support sticky sessions, SSL termination, and integration with Auto Scaling groups for dynamic instance management.

# PARAMETERS

**describe-load-balancers**
> List load balancers and their configuration.

**create-load-balancer**
> Create a new Classic Load Balancer.

**delete-load-balancer**
> Remove a load balancer.

**describe-instance-health**
> Check health status of registered instances.

**register-instances-with-load-balancer**
> Add instances to a load balancer.

**deregister-instances-from-load-balancer**
> Remove instances from a load balancer.

**configure-health-check**
> Set health check parameters.

**create-load-balancer-listeners**
> Add listener configurations.

**delete-load-balancer-listeners**
> Remove listeners.

**set-load-balancer-listener-ssl-certificate**
> Update the SSL certificate for an HTTPS listener.

**describe-load-balancer-attributes**
> Retrieve attributes such as connection draining and access log settings.

**modify-load-balancer-attributes**
> Modify attributes such as connection draining and idle timeout.

**describe-load-balancer-policies**
> List policies associated with load balancers.

**create-load-balancer-policy**
> Create a new policy for a load balancer.

**delete-load-balancer-policy**
> Remove a policy from a load balancer.

**create-app-cookie-stickiness-policy**
> Enable application-controlled session stickiness.

**create-lb-cookie-stickiness-policy**
> Enable load balancer-controlled session stickiness.

**attach-load-balancer-to-subnets**
> Add subnets to a load balancer (VPC only).

**detach-load-balancer-from-subnets**
> Remove subnets from a load balancer.

**enable-availability-zones-for-load-balancer**
> Add Availability Zones to a load balancer (EC2-Classic).

**disable-availability-zones-for-load-balancer**
> Remove Availability Zones from a load balancer.

**apply-security-groups-to-load-balancer**
> Associate security groups with a VPC load balancer.

**add-tags**
> Add or overwrite tags on a load balancer.

**remove-tags**
> Remove tags from a load balancer.

**describe-tags**
> List tags on one or more load balancers.

**describe-account-limits**
> Show ELB service limits for the account.

**wait**
> Wait until a load balancer reaches a specified state.

**--load-balancer-name** _name_
> Name of the load balancer.

**--load-balancer-names** _names_
> List of load balancer names.

**--instances** _ids_
> EC2 instance IDs.

**--listeners** _config_
> Listener protocol and port mappings.

**--subnets** _ids_
> VPC subnets for the load balancer.

**--security-groups** _ids_
> Security groups to assign.

# CAVEATS

Classic Load Balancers are a previous generation service. AWS recommends using Application Load Balancers (ALB) for HTTP/HTTPS or Network Load Balancers (NLB) for TCP/UDP workloads. CLB does not support path-based routing, host-based routing, or WebSocket natively. New features are not being added to CLB.

# HISTORY

Elastic Load Balancing launched in **2009** as one of AWS's earliest services. The Classic Load Balancer was the only load balancer type until **August 2016** when Application Load Balancer was introduced. Network Load Balancer followed in **2017**. Classic Load Balancers remain supported but are considered legacy, with AWS encouraging migration to newer types.

# SEE ALSO

[aws](/man/aws)(1), [aws-elbv2](/man/aws-elbv2)(1), [aws-ec2](/man/aws-ec2)(1), [aws-autoscaling](/man/aws-autoscaling)(1)
