# TLDR

**Authenticate Docker** to an ECR registry

```aws ecr get-login-password | docker login --username AWS --password-stdin [account-id].dkr.ecr.[region].amazonaws.com```

**Create a new repository**

```aws ecr create-repository --repository-name [my-repo]```

**List all repositories** in the registry

```aws ecr describe-repositories```

**List images** in a repository

```aws ecr list-images --repository-name [my-repo]```

**Describe image details** including vulnerabilities

```aws ecr describe-images --repository-name [my-repo] --image-ids imageTag=[latest]```

**Delete an image** by tag

```aws ecr batch-delete-image --repository-name [my-repo] --image-ids imageTag=[v1.0]```

**Set a lifecycle policy** to expire old images

```aws ecr put-lifecycle-policy --repository-name [my-repo] --lifecycle-policy-text file://[policy.json]```

# SYNOPSIS

**aws ecr** _command_ [_options_]

# DESCRIPTION

**aws ecr** is the AWS CLI interface for Amazon Elastic Container Registry (ECR), a fully managed Docker container registry. ECR makes it easy to store, manage, and deploy Docker container images with integration into Amazon ECS and EKS.

ECR provides private repositories with IAM-based access control, automatic image scanning for vulnerabilities, cross-region and cross-account replication, and lifecycle policies for image retention management.

# COMMANDS

**get-login-password**
> Get authentication token for Docker login

**create-repository**
> Create a new image repository

**describe-repositories**
> List repository details

**list-images**
> List images in a repository

**describe-images**
> Get detailed image information

**batch-delete-image**
> Delete one or more images

**put-lifecycle-policy**
> Set image retention rules

**start-image-scan**
> Initiate vulnerability scanning

**describe-image-scan-findings**
> Get scan results

**put-replication-configuration**
> Configure cross-region replication

# CAVEATS

Authentication tokens expire after 12 hours. Image tags are mutable by default; enable tag immutability for production. Lifecycle policies run asynchronously and may take time to delete images. Image scanning must be enabled per repository or at registry level.

# HISTORY

Amazon ECR launched in **December 2015** alongside Amazon ECS. Cross-region replication was added in **2020**, and enhanced scanning powered by Amazon Inspector launched in **2021**. ECR Public for public container images became available in **2020**.

# SEE ALSO

[aws](/man/aws)(1), [docker](/man/docker)(1), [aws-ecs](/man/aws-ecs)(1), [aws-eks](/man/aws-eks)(1)
