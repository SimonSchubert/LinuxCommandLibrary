# TAGLINE

Read and modify package.json fields

# TLDR

**Get a package.json field**

```bun pm pkg get [field]```

**Set a package.json field**

```bun pm pkg set [field]=[value]```

**Delete a package.json field**

```bun pm pkg delete [field]```

# SYNOPSIS

**bun** **pm** **pkg** _subcommand_ [_args_]

# SUBCOMMANDS

**get** _field_
> Get the value of a package.json field.

**set** _field=value_
> Set a package.json field.

**delete** _field_
> Delete a package.json field.

# DESCRIPTION

**bun pm pkg** provides commands to read and modify package.json fields programmatically. This is useful for scripting and automation.

# SEE ALSO

[bun](/man/bun)(1), [bun-pm](/man/bun-pm)(1)
