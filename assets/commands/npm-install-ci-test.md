# TAGLINE

Runs npm ci followed by npm test

# TLDR

**Clean install and test**

```npm install-ci-test```

**Short form**

```npm cit```

**Alternate alias**

```npm sit```

**Skip running lifecycle scripts**

```npm install-ci-test --ignore-scripts```

# SYNOPSIS

**npm install-ci-test**

# DESCRIPTION

**npm install-ci-test** is a combined command that runs **npm ci** followed by **npm test**. It is intended for continuous integration pipelines where you want to guarantee a clean, reproducible install from **package-lock.json** and then immediately execute the project's test suite.

Aliases: **cit**, **clean-install-test**, **sit**.

# CAVEATS

Like **npm ci**, this command requires an existing **package-lock.json** or **npm-shrinkwrap.json** and will remove any existing **node_modules** directory before installing.

# SEE ALSO

[npm](/man/npm)(1), [npm-ci](/man/npm-ci)(1), [npm-test](/man/npm-test)(1)

