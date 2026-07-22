# TAGLINE

Simple and modern file encryption

# TLDR

**Encrypt** a file with a passphrase

```age -p [file.txt] > [file.txt.age]```

**Decrypt** a file with passphrase

```age -d [file.txt.age] > [file.txt]```

Encrypt with **recipient's public key**

```age -r [age1publickey...] [file.txt] > [file.txt.age]```

Encrypt with **multiple recipients**

```age -r [key1] -r [key2] [file.txt] > [file.txt.age]```

Encrypt using **SSH public key**

```age -R [~/.ssh/id_ed25519.pub] [file.txt] > [file.txt.age]```

Decrypt with **identity file**

```age -d -i [key.txt] [file.txt.age] > [file.txt]```

# SYNOPSIS

**age** [_-e_|_-d_] [_-a_] [_-i identity_] [_-r recipient_] [_-R file_] [_-o output_] [_input_]

# DESCRIPTION

**age** is a simple, modern file encryption tool with small explicit keys, no config options, and composable with Unix pipes. It's designed as a replacement for GPG with a cleaner interface and fewer footguns.

age supports encryption to one or more recipients, passphrase encryption, and can use SSH keys for recipient-based encryption. The format is designed to be simple and auditable.

# PARAMETERS

**-e**, **--encrypt**
> Encrypt input (default operation)

**-d**, **--decrypt**
> Decrypt input

**-p**, **--passphrase**
> Encrypt with passphrase

**-r**, **--recipient** _recipient_
> Encrypt to recipient public key (repeatable).

**-R**, **--recipients-file** _file_
> Read recipients from file, one per line (repeatable).

**-i**, **--identity** _identity_
> Identity (private key) file for decryption (repeatable). May also be used with **-e** for SSH or encrypted identities.

**-o** _file_
> Output file (default: stdout)

**-a**, **--armor**
> Use ASCII armored format

# CAVEATS

age does not sign files; use age + signify or minisign for authenticated encryption. Keys are not interchangeable with GPG keys. No built-in key management; keys are just files.

# HISTORY

**age** was designed by Ben Cartwright-Cox and Filippo Valsorda and first released in **2019**. It was created to address the complexity and usability issues of GPG while providing a secure, simple encryption tool suitable for modern use cases.

# INSTALL

```apt: sudo apt install age```

```dnf: sudo dnf install age```

```pacman: sudo pacman -S age```

```apk: sudo apk add age```

```zypper: sudo zypper install age```

```brew: brew install age```

```nix: nix profile install nixpkgs#age```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[age-keygen](/man/age-keygen)(1), [gpg](/man/gpg)(1), [ssh-keygen](/man/ssh-keygen)(1)

# RESOURCES

```[Source code](https://github.com/FiloSottile/age)```

```[Homepage](https://age-encryption.org/)```

<!-- verified: 2026-06-11 -->
