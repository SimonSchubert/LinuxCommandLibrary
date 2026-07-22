# TAGLINE

Secure encrypted profiles for environment variables

# TLDR

**Initialize** envio in a project directory

```envio init```

**Create** an encrypted profile

```envio create [profile]```

**Create** a profile with variables

```envio create [profile] -e [KEY=value] [OTHER=value]```

**List** profiles

```envio list```

**Show** variables in a profile

```envio show [profile]```

**Set** or update a variable

```envio set [profile] [KEY=value]```

**Start a shell** with the profile loaded

```envio shell [profile]```

**Run a command** with the profile environment

```envio run [profile] -- [command]```

# SYNOPSIS

**envio** *command* [*options*] [*args*]

# DESCRIPTION

**envio** manages named **profiles** of environment variables with optional encryption (none, passphrase, symmetric key, or GPG). Profiles can be listed, inspected, edited, checked for expiry, loaded into a new shell, or applied to a single command. Intended for project secrets and multi-environment configuration without committing plaintext **.env** files.

Detailed guide: https://github.com/humblepenguinn/envio/blob/main/docs/usage.md

# PARAMETERS

**init**

> Initialize envio for the current project directory.

**create** | **new** *profile* [**-e** *KEY[=value]*...] [**-k** *cipher*] [**-f** *file*] [**-d** *description*] [**-c**] [**-x**]

> Create a profile. **-k** selects **none**, **passphrase**, **symmetric**, or **gpg**. **-e** adds envs; **-f** imports from a file; **-c**/**-x** prompt for comments/expiry.

**list** | **ls** [**--no-pretty-print**]

> List profiles.

**show** *profile* [**-c**] [**-x**] [**--no-pretty-print**]

> Display keys/values (optional comments and expiration).

**set** *profile* *KEY[=value]*... [**-c**] [**-x**]

> Add or update variables.

**unset** *profile* *KEY*...

> Remove variables.

**edit** *profile*

> Open decrypted profile in **$EDITOR** (requires **EDITOR**).

**check** *profile*

> Report expired or soon-to-expire variables.

**shell** *profile*

> Spawn a shell with the profile environment injected.

**run** *profile* **--** *command*

> Run one command with the profile applied.

Encryption method for a profile cannot be changed after creation. Keep passphrase/symmetric keys safe.

# CAVEATS

**edit** writes secrets to a temporary file (mode 0600 on Unix) while the editor is open. Symmetric keys are shown once at creation—store them offline. Prefer GPG or strong passphrases for production secrets.

# INSTALL

```brew: brew install envio```

```nix: nix profile install nixpkgs#envio```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[direnv](/man/direnv)(1), [env](/man/env)(1), [gpg](/man/gpg)(1)

# RESOURCES

```[Source code](https://github.com/humblepenguinn/envio)```

```[Documentation](https://github.com/humblepenguinn/envio/blob/main/docs/usage.md)```

<!-- verified: 2026-07-19 -->
