# TAGLINE

Encrypted command-line TOTP/HOTP authenticator

# TLDR

**Launch** the interactive OTP dashboard

```cotp```

**Add** a new TOTP code

```cotp add --label [myaccount@gmail.com] --issuer [Google]```

**Add** an HOTP code with custom settings

```cotp add --label [example] --type hotp --algorithm SHA256 --digits 8 --counter 10```

**List** all codes in JSON format

```cotp list --json```

**Extract** a code by issuer and copy to clipboard

```cotp extract --issuer [Google] --copy-clipboard```

**Import** from an encrypted Aegis backup

```cotp import --path [my_backup.json] --aegis-encrypted```

**Export** the database

```cotp export```

# SYNOPSIS

**cotp** [_OPTIONS_] [_SUBCOMMAND_]

# PARAMETERS

**--database-path** _PATH_
> Use a custom database file path.

**--password-stdin**
> Read the database password from stdin.

**--help**
> Display help for the command or subcommand.

# SUBCOMMANDS

**add**
> Add a new TOTP or HOTP code. Options: **--label**, **--issuer**, **--type** (totp/hotp), **--algorithm** (SHA1/SHA256/SHA512), **--digits**, **--counter**.

**edit**
> Edit an existing OTP entry. Options: **--index**, **--digits**.

**list**
> List all codes. Use **--json** for JSON output.

**extract**
> Extract a specific OTP code. Options: **--issuer**, **--copy-clipboard**.

**import**
> Import codes from other authenticator apps. Supports: **--andotp**, **--aegis**, **--aegis-encrypted**, **--authy**, **--authy-exported**, **--cotp**, **--freeotp**, **--freeotp-plus**, **--google-authenticator**, **--microsoft-authenticator**, **--otp-uri**.

**export**
> Export/backup the database.

# DESCRIPTION

**cotp** is a trustworthy, encrypted, command-line TOTP/HOTP authenticator written in Rust. It generates both TOTP (Time-based One-Time Password, RFC 6238) and HOTP (HMAC-based One-Time Password, RFC 4226) codes, and also supports Steam, Yandex, and MOTP code generation.

All data is stored in a single encrypted database file using **XChaCha20Poly1305** authenticated encryption with **Argon2id** key derivation. The default location is **$HOME/.cotp/db.cotp**, configurable via the **COTP_DB_PATH** environment variable. The interactive TUI dashboard displays all OTP codes with fuzzy search, and clipboard copying works over SSH.

# CAVEATS

Some import formats (Authy XML, FreeOTP XML, Google Authenticator, Microsoft Authenticator) require extracting data from the phone first and running a Python conversion script from the **converters/** directory. On Debian-based systems, building from source requires additional X11 development libraries.

# HISTORY

**cotp** was created by **replydev** and first released in **late December 2020**. Written in Rust under the GPL-3.0 license. The latest version is v1.9.7 (September 2025), with 45 total releases. Available in Arch Linux, Debian, Ubuntu, NixOS, and via Homebrew and Cargo.

# SEE ALSO

[oathtool](/man/oathtool)(1), [pass](/man/pass)(1)
