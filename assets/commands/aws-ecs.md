# TAGLINE

Manage Amazon Elastic Container Service resources

# TLDR

**List all ECS clusters**

```aws ecs list-clusters```

**List services** in a cluster

```aws ecs list-services --cluster [cluster_name]```

**Describe a service** with details

```aws ecs describe-services --cluster [cluster_name] --services [service_name]```

**List running tasks** in a cluster

```aws ecs list-tasks --cluster [cluster_name]```

**Run a new task** using a task definition

```aws ecs run-task --cluster [cluster_name] --task-definition [task_def:revision]```

**Update a service** to force new deployment

```aws ecs update-service --cluster [cluster_name] --service [service_name] --force-new-deployment```

**Execute a command** inside a running container

```aws ecs execute-command --cluster [cluster_name] --task [task_id] --container [container_name] --interactive --command "/bin/sh"```

**Stop a running task**

```aws ecs stop-task --cluster [cluster_name] --task [task_arn]```

# SYNOPSIS

**aws ecs** _subcommand_ [_options_]

# DESCRIPTION

**aws ecs** is a subcommand of the AWS CLI that manages Amazon Elastic Container Service, a fully managed container orchestration service. ECS runs Docker containers on a cluster of EC2 instances or serverless with Fargate.

The core concepts are: **clusters** (logical grouping of resources), **task definitions** (blueprints for containers), **tasks** (running instances of task definitions), and **services** (maintain desired count of tasks). ECS integrates with load balancers, auto scaling, and IAM for production workloads.

ECS Exec enables interactive shell access to running containers for debugging, similar to docker exec but through the SSM agent.

# PARAMETERS

**list-clusters**
> List all ECS clusters in the region.

**describe-clusters**
> Get detailed information about clusters.

**create-cluster**
> Create a new ECS cluster.

**delete-cluster**
> Remove an empty cluster.

**list-services**
> List services running in a cluster.

**describe-services**
> Get service details, deployments, and events.

**create-service**
> Create a new service.

**update-service**
> Modify service configuration or trigger deployment.

**delete-service**
> Remove a service from the cluster.

**list-tasks**
> List tasks in a cluster or service.

**describe-tasks**
> Get task details and container status.

**run-task**
> Start a standalone task.

**stop-task**
> Terminate a running task.

**execute-command**
> Run interactive command in a container.

**register-task-definition**
> Create a new task definition revision.

**--cluster** _name_
> Target cluster name or ARN.

**--service** _name_
> Target service name or ARN.

**--task-definition** _name:revision_
> Task definition family and revision.

**--desired-count** _number_
> Number of task instances to run.

**--force-new-deployment**
> Force service to pull new image and redeploy.

# CAVEATS

Deleting a cluster requires stopping all tasks and deleting all services first. Task definitions cannot be deleted, only deregistered. ECS Exec requires the SSM agent and proper IAM permissions on the task role. Fargate tasks must specify CPU and memory at the task level.

# HISTORY

Amazon ECS was announced at **AWS re:Invent 2014** and launched in **April 2015** as AWS's first container orchestration service. **Fargate** serverless compute was added in **November 2017**. ECS Exec for interactive debugging was introduced in **March 2021**. The service continues to evolve alongside AWS's container strategy including integration with EKS.

# SEE ALSO

[aws](/man/aws)(1), [aws-ecr](/man/aws-ecr)(1), [docker](/man/docker)(1), [aws-eks](/man/aws-eks)(1)
