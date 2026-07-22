# TAGLINE

manages npm registry user profile

# TLDR

**Show all profile** properties

```npm profile get```

**Get a specific** profile property (e.g. email, fullname, homepage)

```npm profile get [property]```

**Set a profile field** (email, fullname, homepage, twitter, github)

```npm profile set [field] [value]```

**Change password** (interactive prompt)

```npm profile set password```

**Enable two-factor authentication** (defaults to auth-and-writes)

```npm profile enable-2fa [auth-only|auth-and-writes]```

**Disable 2FA**

```npm profile disable-2fa```

**Output as JSON**

```npm profile get --json```

# SYNOPSIS

**npm profile enable-2fa** [_auth-only_|_auth-and-writes_]

**npm profile disable-2fa**

**npm profile get** [_key_]

**npm profile set** _key_ _value_

# PARAMETERS

**get** [_property_]
> Display all profile properties or one specific property.

**set** _property_ _value_
> Set a profile property. Supported: email, fullname, homepage, freenode, twitter, github.

**set password**
> Interactively change the account password.

**enable-2fa** [_mode_]
> Enable two-factor authentication. Mode is `auth-only` (login/auth changes) or `auth-and-writes` (also publish, dist-tag, access changes). Default is `auth-and-writes`.

**disable-2fa**
> Disable two-factor authentication.

**--registry** _URL_
> Override the registry URL (default https://registry.npmjs.org/).

**--otp** _CODE_
> Provide a one-time password for 2FA-protected actions.

**--json**
> Output results as JSON.

# DESCRIPTION

**npm profile** manages your user profile on the npm registry. It can view and update profile settings (email, fullname, homepage, social handles), change your password interactively, and configure two-factor authentication for account security.

This command depends on the registry implementation; third-party registries may not support all subcommands.

# CAVEATS

Most subcommands only work against npmjs.com or compatible registries. The command is unaware of workspaces. Changing email or enabling 2FA may require an OTP when prompted.

# INSTALL

```pacman: sudo pacman -S npm```

```apk: sudo apk add npm```

```brew: brew install npm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[npm](/man/npm)(1), [npm-adduser](/man/npm-adduser)(1), [npm-access](/man/npm-access)(1), [npm-config](/man/npm-config)(1)

