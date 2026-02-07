# TAGLINE

Manage Systems Manager sessions, commands, and parameters.

# TLDR

**List managed instances**

```aws ssm describe-instance-information```

**Start a Session Manager session** to an instance

```aws ssm start-session --target [i-xxxxxxxxxxxxxxxx]```

**Run a command** on instances

```aws ssm send-command --document-name "AWS-RunShellScript" --targets Key=instanceids,Values=[i-xxxxxxxx] --parameters commands=["echo hello"]```

**Get parameter** from Parameter Store

```aws ssm get-parameter --name [/path/to/parameter]```

**Get parameter with decryption** (for SecureString)

```aws ssm get-parameter --name [/path/to/secret] --with-decryption```

**Put a parameter** into Parameter Store

```aws ssm put-parameter --name [/path/to/parameter] --value "[value]" --type String```

**List parameters** by path

```aws ssm get-parameters-by-path --path [/path/prefix/] --recursive```

**List command invocations**

```aws ssm list-command-invocations --command-id [command-id] --details```

# SYNOPSIS

**aws ssm** _subcommand_ [_options_]

# DESCRIPTION

**aws ssm** is a subcommand of the AWS CLI that manages AWS Systems Manager, a service for operational management of AWS resources. SSM provides capabilities for instance management, configuration, patching, and secure parameter storage.

**Session Manager** enables secure shell access to EC2 instances without SSH keys or open inbound ports. It logs sessions and supports IAM-based access control.

**Run Command** executes scripts and commands across fleets of instances without SSH. **Parameter Store** provides hierarchical storage for configuration data and secrets with optional encryption.

The SSM Agent must be installed on instances for most operations. It comes pre-installed on many AWS AMIs.

# PARAMETERS

**describe-instance-information**
> List instances managed by SSM.

**start-session**
> Start interactive Session Manager session.

**send-command**
> Execute a command on targets.

**list-commands**
> List command history.

**list-command-invocations**
> Get command execution results.

**get-parameter**
> Retrieve a parameter value.

**put-parameter**
> Create or update a parameter.

**get-parameters-by-path**
> List parameters under a path.

**delete-parameter**
> Remove a parameter.

**describe-document**
> Get SSM document details.

**list-documents**
> List available SSM documents.

**--target** _instance-id_
> Target instance for session.

**--document-name** _name_
> SSM document to execute.

**--targets** _targets_
> Target instances for commands.

**--parameters** _params_
> Document parameters.

**--name** _name_
> Parameter name (hierarchical path).

**--value** _value_
> Parameter value.

**--type** _type_
> Parameter type: String, StringList, SecureString.

**--with-decryption**
> Decrypt SecureString parameters.

# CAVEATS

Session Manager requires the SSM Agent and proper IAM instance profile. Parameter names are case-sensitive and hierarchical (use /path/format). SecureString parameters use KMS and may incur charges. Run Command output truncates at 48000 characters; use S3 for large outputs. Default parameter quota is 10,000 standard parameters per account.

# HISTORY

**AWS Systems Manager** evolved from **EC2 Run Command** which launched in **October 2015**. It was unified under the Systems Manager brand in **2017**. **Session Manager** was introduced at **re:Invent 2018** as a secure alternative to SSH. **Parameter Store** expanded to include advanced parameters and higher throughput tiers. The service has grown to include Patch Manager, State Manager, OpsCenter, and Change Manager for comprehensive operations.

# SEE ALSO

[aws](/man/aws)(1), [aws-ec2](/man/aws-ec2)(1), [ssh](/man/ssh)(1), [aws-secretsmanager](/man/aws-secretsmanager)(1)
