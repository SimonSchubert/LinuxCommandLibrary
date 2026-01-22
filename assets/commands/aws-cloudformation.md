# TLDR

**Create a new stack** from a template file

```aws cloudformation create-stack --stack-name [my-stack] --template-body file://[template.yaml]```

**Update an existing stack** with a new template

```aws cloudformation update-stack --stack-name [my-stack] --template-body file://[template.yaml]```

**Delete a stack** and all its resources

```aws cloudformation delete-stack --stack-name [my-stack]```

**Describe stack status** and outputs

```aws cloudformation describe-stacks --stack-name [my-stack]```

**Validate a template** before deployment

```aws cloudformation validate-template --template-body file://[template.yaml]```

**Create a change set** to preview changes before applying

```aws cloudformation create-change-set --stack-name [my-stack] --change-set-name [my-changes] --template-body file://[template.yaml]```

**Package a template** with local artifacts and upload to S3

```aws cloudformation package --template-file [template.yaml] --s3-bucket [my-bucket] --output-template-file [packaged.yaml]```

# SYNOPSIS

**aws cloudformation** _command_ [_options_]

# DESCRIPTION

**aws cloudformation** is the AWS CLI interface for AWS CloudFormation, an infrastructure-as-code service that lets you model and provision AWS resources using templates. Templates define resources declaratively in YAML or JSON format, and CloudFormation handles provisioning and configuration.

CloudFormation manages resources as **stacks**, creating, updating, and deleting all resources together while automatically handling dependencies. Change sets allow previewing modifications before applying them.

# COMMANDS

**create-stack**
> Create a new stack from a template

**update-stack**
> Update an existing stack with changes

**delete-stack**
> Delete a stack and its resources

**describe-stacks**
> Get stack information, status, and outputs

**validate-template**
> Check template syntax and structure

**create-change-set**
> Create a preview of stack changes

**execute-change-set**
> Apply a change set to the stack

**package**
> Upload local artifacts and rewrite template references

**deploy**
> Deploy a template with automatic change set creation

**detect-stack-drift**
> Check for configuration drift from template

# CAVEATS

Stack deletions can fail if resources have deletion protection or dependencies outside CloudFormation. Rollback on failure is automatic but can leave stacks in UPDATE_ROLLBACK_FAILED state requiring manual intervention. Large templates may hit API limits and require nested stacks.

# HISTORY

AWS CloudFormation launched in **February 2011** as one of the first infrastructure-as-code services. It introduced change sets in **2016** for safer updates, drift detection in **2018**, and has continuously expanded resource type coverage. The service now supports over 700 AWS resource types.

# SEE ALSO

[aws](/man/aws)(1), [aws-ec2](/man/aws-ec2)(1), [aws-s3](/man/aws-s3)(1), [terraform](/man/terraform)(1)
