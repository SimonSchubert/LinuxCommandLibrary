# TLDR

**List all Application and Network Load Balancers**

```aws elbv2 describe-load-balancers```

**Describe target groups**

```aws elbv2 describe-target-groups```

**Check target health** in a target group

```aws elbv2 describe-target-health --target-group-arn [arn:aws:elasticloadbalancing:region:account:targetgroup/name/id]```

**Register targets** with a target group

```aws elbv2 register-targets --target-group-arn [target_group_arn] --targets Id=[i-xxxxxxxx],Port=[80]```

**Deregister targets** from a target group

```aws elbv2 deregister-targets --target-group-arn [target_group_arn] --targets Id=[i-xxxxxxxx]```

**Create an Application Load Balancer**

```aws elbv2 create-load-balancer --name [lb_name] --type application --subnets [subnet-1] [subnet-2] --security-groups [sg-xxxxxxxx]```

**List listeners** for a load balancer

```aws elbv2 describe-listeners --load-balancer-arn [load_balancer_arn]```

**Delete a load balancer**

```aws elbv2 delete-load-balancer --load-balancer-arn [load_balancer_arn]```

# SYNOPSIS

**aws elbv2** _subcommand_ [_options_]

# DESCRIPTION

**aws elbv2** is a subcommand of the AWS CLI that manages Application Load Balancers (ALB) and Network Load Balancers (NLB), the second generation of Elastic Load Balancing services.

**Application Load Balancers** operate at Layer 7 and support advanced routing based on URL path, hostname, HTTP headers, and query strings. They integrate with WAF, support WebSocket, and can route to Lambda functions.

**Network Load Balancers** operate at Layer 4 with ultra-low latency and can handle millions of requests per second. They preserve client IP addresses and support static IPs and PrivateLink.

Both types use target groups to route requests to registered targets like EC2 instances, containers, IP addresses, or Lambda functions.

# PARAMETERS

**describe-load-balancers**
> List load balancers and their details.

**create-load-balancer**
> Create a new ALB or NLB.

**delete-load-balancer**
> Remove a load balancer.

**describe-target-groups**
> List target groups.

**create-target-group**
> Create a new target group.

**delete-target-group**
> Remove a target group.

**describe-target-health**
> Check health of targets in a group.

**register-targets**
> Add targets to a group.

**deregister-targets**
> Remove targets from a group.

**describe-listeners**
> List listeners on a load balancer.

**create-listener**
> Add a listener to a load balancer.

**describe-rules**
> List routing rules for a listener.

**--load-balancer-arn** _arn_
> ARN of the load balancer.

**--target-group-arn** _arn_
> ARN of the target group.

**--type** _type_
> Load balancer type: application, network, or gateway.

**--targets** _targets_
> Target specifications (Id, Port, AvailabilityZone).

**--subnets** _ids_
> Subnets for the load balancer.

# CAVEATS

Target groups are bound to a specific load balancer type and cannot be shared between ALB and NLB. Deleting a load balancer does not delete associated target groups. ALB requires at least two subnets in different Availability Zones. Cross-zone load balancing behavior differs between ALB (always enabled) and NLB (configurable).

# HISTORY

**Application Load Balancer** launched in **August 2016** as AWS's Layer 7 load balancer with content-based routing. **Network Load Balancer** followed in **September 2017** for high-performance Layer 4 workloads. **Gateway Load Balancer** was added in **November 2020** for third-party virtual appliances. Features like weighted target groups, Lambda targets, and gRPC support have been added over time.

# SEE ALSO

[aws](/man/aws)(1), [aws-elb](/man/aws-elb)(1), [aws-ec2](/man/aws-ec2)(1), [aws-wafv2](/man/aws-wafv2)(1)
