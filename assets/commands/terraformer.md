# TAGLINE

Generate Terraform config from existing cloud infrastructure

# TLDR

**Import** AWS resources into Terraform files

```terraformer import aws --resources=[vpc,subnet] --regions=[us-east-1]```

**Import** GCP resources for a project

```terraformer import google --resources=[gcs,forwardingRules] --projects=[my-project]```

**List** supported resources for a provider

```terraformer import [provider] list```

**Output JSON** instead of HCL

```terraformer import [provider] --resources=[...] -O json```

# SYNOPSIS

**terraformer** **import** *provider* [*flags*]

# DESCRIPTION

**terraformer** is a reverse-Terraform CLI: it reads live infrastructure via Terraform providers and writes **.tf**/**.json** configuration plus state, so existing cloud resources can be brought under Terraform management. Many providers are supported (AWS, GCP, Azure, Kubernetes, GitHub, and others).

**Important:** As of 2026-03-16 the upstream repository is **archived and unmaintained**. Prefer maintained alternatives for new work; this page documents the historical tool still present in many environments.

# PARAMETERS

**import** *provider*

> Import resources. Provider-specific flags vary; common ones include:

**-r**, **--resources** *list*

> Resource types to import (provider-specific names).

**--regions** / **--projects** / ...

> Cloud account scope (see provider docs under the repo **docs/** tree).

**-O**, **--output** *hcl*|*json*

> Output format (default **hcl**).

**-o**, **--path-output** *dir*

> Output directory (default **generated**).

**-x**, **--excludes** *list*

> Resource types to skip.

**-f**, **--filter** *rules*

> Filter specific resource ids.

**-c**, **--connect**

> Connect resources with remote state references (default true).

**list** (subcommand under import)

> List supported resource types for a provider.

# CAVEATS

**Deprecated / archived upstream**—no security fixes. Generated code often needs manual cleanup before **terraform apply**. Provider credentials and Terraform provider plugins must be configured. Cloudflare and some other providers have known breakage.

# SEE ALSO

[terraform](/man/terraform)(1), [pulumi](/man/pulumi)(1)

# RESOURCES

```[Source code](https://github.com/GoogleCloudPlatform/terraformer)```

<!-- verified: 2026-07-19 -->
