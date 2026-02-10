# TAGLINE

configuration sets default author for new packages

# TLDR

**Set author name**

```npm config set init-author-name "[Your Name]"```

**Set author email**

```npm config set init-author-email "[email@example.com]"```

**Set author URL**

```npm config set init-author-url "[https://example.com]"```

**View author config**

```npm config get init-author-name```

# SYNOPSIS

**npm** **config** **set** **init-author-**_field_ _value_

# PARAMETERS

**init-author-name**
> Package author name.

**init-author-email**
> Package author email.

**init-author-url**
> Package author URL.

**--help**
> Display help information.

# DESCRIPTION

**npm author** configuration sets default author for new packages. Used by npm init.

The settings populate package.json author field. Saves time during initialization.

# CAVEATS

npm config subcommand. Affects npm init only. Global or per-project.

# HISTORY

Author configuration is part of **npm's** init defaults system for package.json creation.

# SEE ALSO

[npm](/man/npm)(1), [npm-config](/man/npm-config)(1), [npm-init](/man/npm-init)(1)

