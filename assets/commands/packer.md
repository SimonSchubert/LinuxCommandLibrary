# TLDR

**Build image from template**

```packer build [template.pkr.hcl]```

**Validate template**

```packer validate [template.pkr.hcl]```

**Initialize plugins**

```packer init [template.pkr.hcl]```

**Format template files**

```packer fmt [template.pkr.hcl]```

**Build with variables**

```packer build -var "[key]=[value]" [template.pkr.hcl]```

**Build specific target only**

```packer build -only [amazon-ebs.web-server] [template.pkr.hcl]```

**Inspect template**

```packer inspect [template.pkr.hcl]```

**Enable debug mode**

```packer build -debug [template.pkr.hcl]```

# SYNOPSIS

**packer** _command_ [_-var key=value_] [_-only target_] [_-except target_] [_options_] _template_

# PARAMETERS

**build**
> Build image from template.

**validate**
> Check template syntax.

**init**
> Install required plugins.

**fmt**
> Format template files.

**inspect**
> Show template components.

**console**
> Interactive HCL console.

**-var** _key=value_
> Set variable value.

**-var-file** _file_
> Variable definitions file.

**-only** _name_
> Build only specified builders.

**-except** _name_
> Skip specified builders.

**-force**
> Force build, overwriting existing.

**-on-error** _ACTION_
> Action on error: cleanup, abort, ask, run-cleanup-provisioner.

**-debug**
> Debug mode with breakpoints.

**-parallel-builds** _N_
> Parallel build limit.

**-timestamp-ui**
> Add timestamps to UI output.

# DESCRIPTION

**Packer** is HashiCorp's tool for creating machine images across multiple platforms from a single source configuration. It automates image building for AWS, Azure, GCP, Docker, VMware, and many other platforms.

Templates define builders (where to create images), provisioners (how to configure them), and post-processors (what to do with finished images). Modern templates use HCL format (.pkr.hcl), though JSON is still supported.

Builders create the initial machine instance. Examples include amazon-ebs for AWS AMIs, azure-arm for Azure images, and docker for containers. Each builder handles platform-specific details.

Provisioners run after the machine boots: shell scripts, Ansible, Chef, Puppet, or file uploads configure the image. Multiple provisioners run in sequence, building up the configuration.

Post-processors handle finished images: upload to registries, compress, or create Vagrant boxes. Images can be distributed to multiple regions or clouds.

# CAVEATS

Platform credentials required for cloud builders. Build times vary significantly by platform. Large images require more time and storage. Debug mode pauses between steps. JSON templates are deprecated but still work. Plugin initialization required for non-bundled builders.

# HISTORY

**Packer** was released by **HashiCorp** in **2013**, created by Mitchell Hashimoto. It addressed the challenge of creating identical machine images across multiple platforms. The tool became essential in DevOps workflows for immutable infrastructure. In **2020**, HCL2 template format was introduced, aligning with Terraform syntax.

# SEE ALSO

[terraform](/man/terraform)(1), [vagrant](/man/vagrant)(1), [docker](/man/docker)(1), [ansible](/man/ansible)(1)
