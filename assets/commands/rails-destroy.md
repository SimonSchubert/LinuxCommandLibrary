# TLDR

**Remove model**

```rails destroy model [Name]```

**Remove controller**

```rails destroy controller [Name]```

**Remove scaffold**

```rails destroy scaffold [Name]```

**Remove migration**

```rails destroy migration [Name]```

# SYNOPSIS

**rails** **destroy** _generator_ _name_ [_options_]

# PARAMETERS

**model** _name_
> Remove model.

**controller** _name_
> Remove controller.

**scaffold** _name_
> Remove scaffold.

**migration** _name_
> Remove migration.

**-p**, **--pretend**
> Preview without removing.

# DESCRIPTION

**rails destroy** removes files created by Rails generators. Reverses the effect of rails generate. Removes related files, routes, and test files.

# SEE ALSO

[rails](/man/rails)(1), [rails-generate](/man/rails-generate)(1)

