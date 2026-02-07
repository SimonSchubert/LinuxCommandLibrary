# TAGLINE

Run batch computing workloads on managed infrastructure

# TLDR

**Submit a job** to an existing job queue

```aws batch submit-job --job-name [my-job] --job-queue [my-queue] --job-definition [my-definition]```

**List all jobs** in a queue with a specific status

```aws batch list-jobs --job-queue [my-queue] --job-status [RUNNING|SUBMITTED|PENDING|SUCCEEDED|FAILED]```

**Describe details** of specific jobs by ID

```aws batch describe-jobs --jobs [job-id-1] [job-id-2]```

**Create a managed compute environment** with specific instance types

```aws batch create-compute-environment --compute-environment-name [my-env] --type MANAGED --compute-resources type=EC2,minvCpus=0,maxvCpus=256,instanceTypes=optimal```

**Register a job definition** from a JSON file

```aws batch register-job-definition --cli-input-json file://[job-definition.json]```

**Cancel a running job** by ID

```aws batch cancel-job --job-id [job-id] --reason "[cancellation reason]"```

# SYNOPSIS

**aws batch** _command_ [_options_]

# DESCRIPTION

**aws batch** is the AWS CLI interface for Amazon Web Services Batch, a fully managed service for running batch computing workloads on AWS Cloud. It automatically provisions compute resources and optimizes workload distribution based on quantity and scale of workloads.

AWS Batch eliminates the need to install or manage batch computing software, removing capacity constraints and reducing overall compute costs. It supports batch computing workloads of any scale, from simple shell scripts to complex multi-node parallel jobs.

# COMMANDS

**submit-job**
> Submit a batch job from a job definition to a job queue

**cancel-job**
> Cancel a pending or running job in a queue

**terminate-job**
> Terminate a running job

**describe-jobs**
> Describe one or more jobs

**list-jobs**
> List jobs filtered by queue and status

**register-job-definition**
> Register a new job definition

**describe-job-definitions**
> Describe job definitions

**create-compute-environment**
> Create a managed or unmanaged compute environment

**describe-compute-environments**
> Describe compute environments

**create-job-queue**
> Create a job queue associated with a compute environment

**describe-job-queues**
> Describe job queues

# CAVEATS

AWS Batch requires proper IAM permissions for compute environments, job queues, and job execution roles. Jobs may fail silently if container images are inaccessible or if resource limits are exceeded. Always monitor job status with **describe-jobs** as job failures may not surface immediately.

# HISTORY

AWS Batch was launched in **December 2016** as a managed batch processing service. It was designed to simplify running batch jobs at scale without managing infrastructure. The service has evolved to support Fargate compute, multi-node parallel jobs, and integration with AWS Step Functions for workflow orchestration.

# SEE ALSO

[aws](/man/aws)(1), [aws-ec2](/man/aws-ec2)(1), [aws-ecs](/man/aws-ecs)(1), [aws-lambda](/man/aws-lambda)(1)
