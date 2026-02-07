# TAGLINE

infrastructure automation and configuration management platform

# TLDR

**Generate a new cookbook**

```chef generate cookbook [cookbook_name]```

**Generate a new recipe**

```chef generate recipe [cookbook_name] [recipe_name]```

**Verify cookbook syntax**

```chef exec cookstyle [cookbook_path]```

**Run cookbook locally**

```chef-client --local-mode --runlist "[recipe[cookbook::recipe]]"```

**Show installed version**

```chef --version```

**Install gem into Chef**

```chef gem install [gem_name]```

**Run InSpec tests**

```chef exec inspec exec [test_path]```

# SYNOPSIS

**chef** _command_ [_options_]

# DESCRIPTION

**chef** is the command-line interface for Chef Workstation, a configuration management and infrastructure automation platform. It provides tools for developing, testing, and managing cookbooks that define system configurations.

Cookbooks contain recipes written in Ruby DSL that describe desired system states. Chef applies these recipes to nodes, ensuring consistent configuration across infrastructure. The workflow includes local development, testing with Test Kitchen, and deployment to Chef Server.

# PARAMETERS

**generate** _type_ _name_
> Generate cookbook, recipe, template, or other component.

**exec** _command_
> Run command in Chef context with bundled Ruby.

**gem** _subcommand_
> Manage Ruby gems in Chef's environment.

**install** _policyfile_
> Install cookbooks from Policyfile.

**update** _policyfile_
> Update cookbooks in Policyfile.

**export** _policyfile_ _path_
> Export policy archive for deployment.

**push** _policy_group_ _policyfile_
> Push policy to Chef Server.

**--version**
> Show version information.

**--help**
> Display help information.

# CONFIGURATION

**~/.chef/config.rb**
> Main Chef Workstation configuration file. Sets default Chef Server URL, client key path, cookbook paths, and node name.

**~/.chef/credentials**
> Stores Chef Server credentials and profiles for managing multiple organizations.

**/etc/chef/client.rb**
> Chef client configuration on managed nodes. Sets server URL, node name, validation key, and run list intervals.

# CAVEATS

Requires Ruby knowledge for recipe development. Chef Server setup needed for centralized management. Local mode testing requires sufficient resources. Cookbooks may have complex dependencies.

# HISTORY

**Chef** was created by **Adam Jacob** at **Opscode** (later Chef Software) in **2009**. It pioneered the "infrastructure as code" concept alongside Puppet. Chef was written in Ruby and Erlang, and gained popularity for its flexibility. In **2020**, Chef was acquired by **Progress Software**. The tooling has evolved from knife-centric workflows to modern Chef Workstation.

# SEE ALSO

[knife](/man/knife)(1), [kitchen](/man/kitchen)(1), [inspec](/man/inspec)(1), [ansible](/man/ansible)(1), [puppet](/man/puppet)(1)
