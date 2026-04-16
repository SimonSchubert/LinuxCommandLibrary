# TAGLINE

runs npm install followed by npm test

# TLDR

**Install dependencies and run tests**

```npm it```

**Install and test in a clean CI environment**

```npm cit```

**Show help for install-test**

```npm it --help```

# SYNOPSIS

**npm** **it** [_options_]

**npm** **install-test** [_options_]

# PARAMETERS

**--help**
> Display help information.

Any flag accepted by **npm install** may be passed and will be forwarded to the install step.

# DESCRIPTION

**npm it** is a shortcut that runs **npm install** followed by **npm test**. It is an alias for **npm install-test**, intended to quickly verify that a project installs cleanly and its test suite passes.

A related command **npm cit** (alias of **npm clean-install-test**) performs a **npm ci** (clean install) followed by **npm test**, useful in CI pipelines where a reproducible install from the lockfile is required.

# CAVEATS

Both steps must succeed; if the install fails, tests are not run. If tests fail, the exit code is non-zero. Use **npm cit** in CI for clean, lockfile-based installs.

# HISTORY

npm it is a **shorthand alias** combining install and test operations.

# SEE ALSO

[npm](/man/npm)(1), [npm-install](/man/npm-install)(1), [npm-test](/man/npm-test)(1)

