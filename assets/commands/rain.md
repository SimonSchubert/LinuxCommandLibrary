# TLDR

**List all CloudFormation stacks** in the current region

```rain ls```

**Deploy a CloudFormation template**

```rain deploy [template.yaml] [stack-name]```

**Get the template from a running stack**

```rain cat [stack-name]```

**Show event logs** for a stack

```rain logs [stack-name]```

**Format a CloudFormation template**

```rain fmt [template.yaml]```

**Compare two templates**

```rain diff [template1.yaml] [template2.yaml]```

**Delete a CloudFormation stack**

```rain rm [stack-name]```

**Predict deployment failures** before deploying

```rain forecast [template.yaml] [stack-name]```

# SYNOPSIS

**rain** _command_ [_options_] [_arguments_]

# PARAMETERS

**ls**
> List CloudFormation stacks or changesets in the current region

**deploy** _template_ _stack-name_
> Deploy a CloudFormation stack from a local template

**cat** _stack-name_
> Retrieve and display the template of a running stack

**logs** _stack-name_
> Show the event log for the specified stack

**rm** _stack-name_
> Delete a CloudFormation stack

**fmt** _template_
> Format CloudFormation templates to a consistent style

**diff** _template1_ _template2_
> Compare two CloudFormation templates

**build** _resource-type_
> Create CloudFormation templates for specified resource types

**forecast** _template_ _stack-name_
> Predict potential deployment failures

**pkg** _template_
> Package local artifacts for deployment (replacement for aws cloudformation package)

**bootstrap**
> Create the S3 artifacts bucket for deployments

**--region**, **-r** _region_
> Specify AWS region

**--profile**, **-p** _profile_
> Use a specific AWS profile

**--experimental**, **-x**
> Enable experimental commands

**--help**, **-h**
> Display help information

# DESCRIPTION

**rain** is a development workflow tool for AWS CloudFormation that simplifies template authoring, validation, and stack management. It provides a more user-friendly interface than the standard AWS CLI for CloudFormation operations.

Key improvements over the AWS CLI include live deployment progress with colored output, automatic template formatting, template comparison, and deployment failure prediction. Rain can detect potential issues before deployment, saving time and reducing failed stack operations.

The tool supports CloudFormation modules and can package local artifacts like Lambda code for deployment. It handles the complexity of S3 bucket management for artifacts automatically.

# CAVEATS

Requires AWS credentials configured via environment variables, AWS CLI profiles, or IAM roles. Ensure the AWS account has appropriate CloudFormation and related service permissions.

Some commands like **forecast** are experimental and require the **-x** flag. Experimental features may change between versions.

Rain operates on one region at a time. Use **--region** to specify a different region than the default.

# HISTORY

Rain was developed by the **AWS CloudFormation team** and released as an open-source tool to improve the CloudFormation development experience. The name is a play on "what happens when you have a lot of CloudFormation." It is written in Go and actively maintained on GitHub.

# SEE ALSO

[aws](/man/aws)(1), [terraform](/man/terraform)(1), [sam](/man/sam)(1), [cdk](/man/cdk)(1)
