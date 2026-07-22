# TAGLINE

Build and sign Unified Kernel Images for UEFI

# TLDR

**Build a UKI** from a kernel and initrd with a kernel command line

```ukify build --linux=[/boot/vmlinuz] --initrd=[/boot/initrd.img] --cmdline=["root=/dev/sda1 ro"] --output=[uki.efi]```

**Build and sign** the image for Secure Boot

```ukify build --linux=[vmlinuz] --initrd=[initrd.img] --secureboot-private-key=[sb.key] --secureboot-certificate=[sb.crt]```

**Generate** Secure Boot and PCR signing keys and certificates

```ukify genkey --secureboot-private-key=[sb.key] --secureboot-certificate=[sb.crt]```

**Inspect** the sections of an existing UKI

```ukify inspect [/boot/EFI/Linux/uki.efi]```

**Build from** a configuration file instead of long command lines

```ukify build --config=[/etc/kernel/uki.conf]```

# SYNOPSIS

**ukify** [_options_] **build**

**ukify** [_options_] **genkey**

**ukify** [_options_] **inspect** _file..._

# DESCRIPTION

**ukify** combines a kernel, an initrd, a kernel command line, the **systemd-stub** UEFI boot stub, and other resources into a single **Unified Kernel Image** (UKI). A UKI is one PE/COFF EFI executable that the firmware can boot directly or that **systemd-boot** can list, removing the need for a separate boot loader configuration for the kernel and initrd.

Because everything lives in one file, the whole image (including the embedded command line) can be signed once for **Secure Boot**, and its contents can be measured into TPM **PCRs** for measured boot and TPM-based disk unlocking. ukify embeds the components as named PE sections (such as **.linux**, **.initrd**, **.cmdline**, **.osrel**, and **.uname**), optionally adds a boot splash and a devicetree, and writes the result to an .efi file.

The tool exposes three verbs: **build** assembles and optionally signs the image, **genkey** creates the Secure Boot and PCR signing key material, and **inspect** prints the sections of an existing UKI together with their sizes and SHA256 digests.

# PARAMETERS

**--linux=** _PATH_
> Path to the kernel image embedded as the **.linux** section.

**--initrd=** _PATH_
> Path to an initrd; may be given multiple times to concatenate several.

**--cmdline=** _TEXT_|_@PATH_
> Kernel command line, given literally or read from a file.

**--os-release=** _TEXT_|_@PATH_
> Operating system identification; taken from the host **os-release** if omitted.

**--output=** _FILENAME_
> Destination path for the generated image.

**--stub=** _PATH_
> Path to the **systemd-stub** EFI stub to use.

**--config=** _PATH_
> Read build settings from a configuration file.

**--secureboot-private-key=** _KEY_
> Private key used to sign the resulting binary for Secure Boot.

**--secureboot-certificate=** _CERT_
> Certificate matching the Secure Boot private key.

**--signtool=** _SIGNER_
> Signing backend: **sbsign**, **pesign**, or **systemd-sbsign** (default sbsign).

**--pcr-private-key=** _PATH_
> Private key for signing the PCR policy; may be repeated.

**--measure**
> Pre-calculate and embed expected PCR values via **systemd-measure**.

# CAVEATS

A UKI bundles the command line into the signed image, so changing boot parameters means rebuilding (and re-signing) the image rather than editing a loader entry. Secure Boot signing requires keys enrolled in firmware, and the chosen **--signtool** (sbsign/pesign) must be installed. ukify is implemented in Python and depends on tools such as **objcopy** for assembling PE sections.

# HISTORY

**ukify** was introduced in **systemd v253** as an experimental helper for assembling Unified Kernel Images, and was expanded in later releases (v254 and onward) with additional verbs and signing options. It complements **kernel-install** and **systemd-boot** in systemd's UEFI boot toolchain.

# INSTALL

```apk: sudo apk add ukify```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[bootctl](/man/bootctl)(1), [kernel-install](/man/kernel-install)(8), [dracut](/man/dracut)(8), [objcopy](/man/objcopy)(1), [efibootmgr](/man/efibootmgr)(8)
