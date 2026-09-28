# TAGLINE

manages Angular CLI usage analytics

# TLDR

**Enable analytics** for the current workspace

```ng analytics enable```

**Disable analytics** for the current workspace

```ng analytics disable```

**Disable analytics globally** for your user

```ng analytics disable --global```

**Check analytics status**

```ng analytics info```

**Prompt for analytics**

```ng analytics prompt```

**Disable analytics** via environment variable (e.g. in CI)

```NG_CLI_ANALYTICS=false ng [command]```

# SYNOPSIS

**ng analytics** _command_ [_options_]

# PARAMETERS

**enable** (alias **on**)
> Enable usage analytics.

**disable** (alias **off**)
> Disable usage analytics.

**info**
> Show current analytics configuration.

**prompt**
> Interactively ask to set the analytics preference.

**-g**, **--global**
> Apply to the global configuration in the home directory instead of the current workspace (enable, disable, prompt).

# DESCRIPTION

**ng analytics** manages Angular CLI usage analytics. It controls whether anonymous usage data is shared with the Angular team to improve the CLI.

The setting is stored in the workspace angular.json, or in the global CLI configuration (e.g. ~/.angular-config.json or under ~/.config/angular/) with --global. Outside a workspace, the global setting is used.

# CAVEATS

Setting the environment variable **NG_CLI_ANALYTICS** to false disables analytics and suppresses the prompt, which is useful in CI.

# SEE ALSO

[ng](/man/ng)(1), [ng-config](/man/ng-config)(1)

# RESOURCES

```[Source code](https://github.com/angular/angular-cli)```

```[Documentation](https://angular.dev/cli/analytics)```

<!-- verified: 2026-09-29 -->
