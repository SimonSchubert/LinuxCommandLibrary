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

**init-license**
> Default SPDX license id for new packages (default: `ISC`).

**init-version**
> Default semver version for new packages (default: `1.0.0`).

# DESCRIPTION

**npm-author** is a configuration concept rather than a standalone subcommand: it refers to the `init-author-*` keys read by **npm init** (and **npm create**) when populating the `author` field of a new `package.json`.

Setting these values with **npm config set** once — typically in the user-level `~/.npmrc` — saves retyping them every time a new package is initialized. They can also be set per-project via a local `.npmrc`.

The underlying config keys are unset by default; if they are empty, `npm init` prompts for a value interactively.

# CAVEATS

npm config subcommand. Affects npm init only. Global or per-project.

# HISTORY

Author configuration is part of **npm's** init defaults system for package.json creation.

# SEE ALSO

[npm](/man/npm)(1), [npm-config](/man/npm-config)(1), [npm-init](/man/npm-init)(1)

