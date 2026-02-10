# TAGLINE

runs scripts defined in package

# TLDR

**Run npm script**

```npm run [script-name]```

**Run with arguments**

```npm run [script] -- [args]```

**List available scripts**

```npm run```

**Run script silently**

```npm run [script] --silent```

# SYNOPSIS

**npm** **run-script** _script_ [_options_]

# PARAMETERS

**--silent**
> Suppress output.

**--if-present**
> Don't error if script missing.

**--**
> Pass arguments to script.

# DESCRIPTION

**npm run-script** runs scripts defined in package.json scripts field. Alias: npm run. Without arguments, lists available scripts. Arguments after -- are passed to the script.

# SEE ALSO

[npm](/man/npm)(1), [npm-start](/man/npm-start)(1)

