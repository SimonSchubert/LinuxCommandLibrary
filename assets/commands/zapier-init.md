# TAGLINE

Initialize new Zapier integration project

# TLDR

**Initialize new integration**

```zapier-platform init [path]```

**Initialize with template**

```zapier-platform init [path] --template [oauth2]```

**Use TypeScript**

```zapier-platform init [path] --template [oauth2] --language typescript```

**Use ES modules**

```zapier-platform init [path] --template minimal --module esm```

# SYNOPSIS

**zapier-platform** **init** _path_ [_options_]

# PARAMETERS

**-t**, **--template** _name_
> Template to use: **basic-auth**, **callback**, **custom-auth**, **digest-auth**, **dynamic-dropdown**, **files**, **line-items**, **minimal**, **oauth1-trello**, **oauth2**, **openai**, **search-or-create** or **session-auth**.

**-m**, **--module** _type_
> Module type: **commonjs** or **esm**. Only for TypeScript and minimal templates.

**-l**, **--language** _lang_
> Language: **javascript** (default) or **typescript**.

**-d**, **--debug**
> Show extra debugging output.

# DESCRIPTION

**zapier-platform init** creates a new Zapier integration from a project template in the specified directory, creating it if needed. If the directory is not empty, it asks for confirmation before overwriting.

It does not register or deploy the integration: use **zapier-platform register** and **zapier-platform push** for that.

# CAVEATS

The binary is **zapier-platform**. The old **zapier** name was deprecated in zapier-platform-cli 18.0.0 and removed in 19.0.0.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-scaffold](/man/zapier-scaffold)(1), [zapier-push](/man/zapier-push)(1)

# RESOURCES

```[Source code](https://github.com/zapier/zapier-platform)```

```[Documentation](https://github.com/zapier/zapier-platform/blob/main/packages/cli/docs/cli.md)```

<!-- verified: 2026-11-09 -->
