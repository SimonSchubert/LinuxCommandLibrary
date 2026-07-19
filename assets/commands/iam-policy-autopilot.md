# TAGLINE

Generate baseline AWS IAM policies from application source

# TLDR

**Generate policies** from source (pretty JSON)

```iam-policy-autopilot generate-policies [./src/app.py] --pretty```

**Limit analysis** with service hints

```iam-policy-autopilot generate-policies [./src/app.py] --service-hints s3 iam organizations --pretty```

**Include region and account** in resource ARNs

```iam-policy-autopilot generate-policies [./src] --region [us-east-1] --account [123456789012] --pretty```

**Suggest fixes** for an AccessDenied error

```iam-policy-autopilot fix-access-denied "[error message text]"```

**Start MCP server** for AI coding assistants

```iam-policy-autopilot mcp-server```

**MCP over HTTP**

```iam-policy-autopilot mcp-server --transport http```

# SYNOPSIS

**iam-policy-autopilot** *command* [*options*]

# DESCRIPTION

**IAM Policy Autopilot** is an open-source CLI and MCP server from AWS Labs that analyzes application code locally and produces baseline identity-based IAM policies for the AWS SDK calls it finds. Supported languages and SDKs include Python (Boto3/Botocore), Go (AWS SDK v2), Java (SDK v2), and JavaScript/TypeScript (AWS SDK v3).

It also helps interpret **AccessDenied** errors and can run as an MCP server so AI coding assistants can request policy generation. Install via **uvx iam-policy-autopilot**, **pip install iam-policy-autopilot**, or the project install script to **/usr/local/bin/iam-policy-autopilot**.

Generated policies are starting points: review and tighten them before production. The tool does not produce resource-based policies (bucket policies, KMS key policies), SCPs, RCPs, or permission boundaries.

# PARAMETERS

**generate-policies** *source_files*...

> Analyze sources and emit IAM policy documents.
>
> **--region** *REGION* – region for resource ARNs
>
> **--account** *ACCOUNT* – AWS account id for ARNs
>
> **--service-hints** *SERVICES* – limit analysis to named services (recommended)
>
> **--upload-policies** *PREFIX* – upload generated policies to IAM with a name prefix
>
> **--pretty** – pretty-print JSON

**fix-access-denied** *message*

> Analyze an AccessDenied error string and suggest policy changes. **--yes** applies changes without confirmation.

**mcp-server**

> Start the MCP server. **--transport** **stdio** (default) or **http**.

**-h**, **--help** / **-V**, **--version**

> Help and version.

# CAVEATS

Static analysis may include extra actions when method names match multiple services; use **--service-hints**. Runtime resource names are not always known, so resource ARNs may be broad. AI assistants may further edit policies when generating IaC; always review before deploy. Some commands need AWS credentials configured (AWS CLI profile/region). Corporate proxies may need network allowlisting for AWS endpoints.

# SEE ALSO

[aws](/man/aws)(1), [iam-policy-json-to-terraform](/man/iam-policy-json-to-terraform)(1), [policy_sentry](/man/policy_sentry)(1)

# RESOURCES

```[Source code](https://github.com/awslabs/iam-policy-autopilot)```

```[Documentation](https://github.com/awslabs/iam-policy-autopilot#readme)```

<!-- verified: 2026-07-19 -->
