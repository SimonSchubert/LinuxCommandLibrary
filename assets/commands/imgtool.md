# TAGLINE

manages MCUboot firmware images

# TLDR

**Create MCUboot image**

```imgtool create --key [key.pem] --align 4 --version 1.0.0 [app.bin] [signed.bin]```

**Sign image**

```imgtool sign --key [key.pem] [input.bin] [output.bin]```

**Get image info**

```imgtool getinfo [image.bin]```

**Generate keys**

```imgtool keygen --key [key.pem] --type rsa-2048```

# SYNOPSIS

**imgtool** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation to perform.

**create**
> Create signed image.

**sign**
> Sign existing image.

**getinfo**
> Show image information.

**keygen**
> Generate signing keys.

**--key** _FILE_
> Key file.

**--help**
> Display help information.

# DESCRIPTION

**imgtool** manages MCUboot firmware images. It creates, signs, and inspects bootloader-compatible images.

The tool is essential for secure boot workflows. It handles image headers, signatures, and version information.

# CAVEATS

Part of MCUboot project. Specific image format. Cryptographic keys required.

# HISTORY

imgtool is part of **MCUboot**, an open-source secure bootloader for microcontrollers.

# INSTALL

```apt: sudo apt install mame-tools```

```dnf: sudo dnf install mame-tools```

```pacman: sudo pacman -S mame-tools```

```zypper: sudo zypper install mame-tools```

```nix: nix profile install nixpkgs#mame-tools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[openssl](/man/openssl)(1)
