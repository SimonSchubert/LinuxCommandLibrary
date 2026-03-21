# TAGLINE

Mark a package as favorite on the npm registry

# TLDR

**Star a package**

```npm star [package]```

**Star multiple packages**

```npm star [package1] [package2]```

**View your starred packages**

```npm stars```

**Unstar a package**

```npm unstar [package]```

# SYNOPSIS

**npm** **star** _package_...

# DESCRIPTION

**npm star** marks one or more packages as favorites on the npm registry. It is a way to show appreciation for packages you find useful. Requires npm authentication via **npm login**.

Starred packages can be listed later with **npm stars**. To remove a star, use **npm unstar**.

# PARAMETERS

**--registry** _url_
> Use the specified registry URL instead of the default.

**--otp** _code_
> Provide a one-time password for two-factor authentication.

# CAVEATS

Requires being logged in to npm (**npm login**). Stars are public and associated with your npm account.

# SEE ALSO

[npm](/man/npm)(1), [npm-unstar](/man/npm-unstar)(1), [npm-stars](/man/npm-stars)(1), [npm-login](/man/npm-login)(1)

