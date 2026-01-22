# TLDR

**Install cookbook dependencies**

```berks install```

**Update a specific cookbook** and its dependencies

```berks update [cookbook-name]```

**Upload cookbooks** to a Chef Infra Server

```berks upload```

**Package cookbooks** into an archive

```berks package [output.tar.gz]```

**List installed cookbooks** and dependencies

```berks list```

**Check for outdated** cookbook versions

```berks outdated```

**Generate a dependency graph** visualization

```berks viz```

**Show cookbook info**

```berks info [cookbook-name]```

# SYNOPSIS

**berks** _subcommand_ [_options_]

# DESCRIPTION

**berks** (Berkshelf) is a dependency manager for Chef cookbooks. It resolves and manages cookbook dependencies defined in a Berksfile, similar to how Bundler manages Ruby gems.

Berkshelf ensures consistent cookbook versions across development, testing, and production environments. It can fetch cookbooks from the Chef Supermarket, Git repositories, or local paths.

# SUBCOMMANDS

**install**
> Install cookbooks into the local cache based on Berksfile.lock

**update**
> Update one or all cookbook dependencies

**upload**
> Upload resolved cookbooks to the Chef Infra Server

**package**
> Package cookbook dependencies into a tar archive

**list**
> List cookbooks and their dependencies

**outdated**
> Show cookbooks with newer versions available

**viz**
> Generate a dependency graph image

**info**
> Display metadata for a specific cookbook

**apply**
> Apply version locks to a Chef environment

**vendor**
> Vendor cookbooks into a local directory

**version**
> Display Berkshelf version

# PARAMETERS

**--format** _value_
> Output format: human (default), json, null

**--berksfile** _value_
> Path to the Berksfile

**--except** _value_
> Exclude cookbook groups

**--only** _value_
> Include only specified groups

**-q, --quiet**
> Suppress output

**-d, --debug**
> Enable debug output

# CAVEATS

Berkshelf is deprecated and no longer actively maintained. New users should use **Policyfiles** instead, which is the recommended approach for managing Chef cookbook dependencies. Existing Berkshelf users are encouraged to migrate.

# HISTORY

Berkshelf was created by **Jamie Winsor** and **Seth Vargo** in **2012** to solve Chef cookbook dependency management. It became part of the Chef Development Kit (ChefDK) and later Chef Workstation. Chef announced Policyfiles as the successor in **2015**.

# SEE ALSO

[chef](/man/chef)(1), [knife](/man/knife)(1), [kitchen](/man/kitchen)(1)
