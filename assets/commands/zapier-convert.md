# TAGLINE

Convert Visual Builder integrations to CLI

# TLDR

**Convert a Visual Builder integration**

```zapier-platform convert [path] --integrationId [id] --version [version]```

**Convert from a JSON definition file**

```zapier-platform convert [path] --json @[file.json] --title "[title]"```

# SYNOPSIS

**zapier-platform** **convert** _path_ [_options_]

# PARAMETERS

_path_
> Target directory, relative to the current path.

**-i**, **--integrationId** _id_
> Integration ID: the number after **/app/** in the URL on developer.zapier.com.

**-v**, **--version** _version_
> Version to convert. Required when converting a Visual Builder integration.

**-j**, **--json** _json_
> JSON definition to use instead of reading from a Visual Builder integration. Accepts inline JSON, **@file.json** or **@-** for stdin.

**-t**, **--title** _title_
> Integration title, snake-cased for the package.json name.

**-d**, **--description** _text_
> Integration description for package.json.

**--debug**
> Show extra debugging output.

# DESCRIPTION

**zapier-platform convert** converts a Visual Builder integration to a CLI integration. The result is identical to its Visual Builder version and ready to push.

Re-running it on an existing directory leaves existing files alone. Run **zapier-platform push** before the new version is visible in the editor.

# CAVEATS

The binary is **zapier-platform**. The old **zapier** name was deprecated in zapier-platform-cli 18.0.0 and removed in 19.0.0.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-init](/man/zapier-init)(1), [zapier-push](/man/zapier-push)(1)

# RESOURCES

```[Source code](https://github.com/zapier/zapier-platform)```

```[Documentation](https://github.com/zapier/zapier-platform/blob/main/packages/cli/docs/cli.md)```

<!-- verified: 2026-11-09 -->
