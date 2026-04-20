# TAGLINE

Unified dispatcher for tpm2-tools utilities

# TLDR

**List all available** TPM2 subcommands

```tpm2 --help```

**Get 8 random bytes** from the TPM

```tpm2 getrandom 8 | xxd -p```

**Initialize the TPM** after boot

```tpm2 startup -c```

**Read PCR values** for the SHA-256 bank

```tpm2 pcrread sha256:all```

**Extend a PCR** with a precomputed hash

```tpm2 pcrextend [index]:sha256=[hexdigest]```

**Reset a resettable PCR** (typically index 16 or 23)

```tpm2 pcrreset [index]```

**Create a primary key** under the owner hierarchy

```tpm2 createprimary -C o -c primary.ctx```

**Use a specific TCTI** (e.g. the simulator)

```tpm2 --tcti=mssim getrandom 8```

# SYNOPSIS

**tpm2** _tool_ [_options_] [_arguments_]

**tpm2_**_tool_ [_options_] [_arguments_]

# DESCRIPTION

**tpm2** is a single busybox-style executable that combines all of the individual **tpm2-tools** utilities into one binary. Each historical tool, such as **tpm2_getrandom** or **tpm2_pcrread**, is available as a subcommand of **tpm2** (invoke **tpm2 getrandom**) as well as through a symlink of the original name.

The dispatcher exists primarily to shrink the footprint of **tpm2-tools** on size-constrained systems (initramfs images, embedded devices, recovery environments) where shipping dozens of separate binaries is wasteful. Because each _tpm2_<tool>_ symlink points back to the same binary, behaviour is identical between the two invocation styles.

Tools cover the full TPM 2.0 command surface: key creation and loading, NV storage, PCR operations, session and policy management, attestation, and auditing.

# COMMON OPTIONS

**-h**, **--help**[=_man_|_no-man_]
> Show the help page for the selected tool. With **=man**, render the manpage via **man**; with **=no-man**, print a plain summary.

**-v**, **--version**
> Print version information for **tpm2-tools**.

**-V**, **--verbose**
> Increase console output; useful for debugging.

**-Q**, **--quiet**
> Suppress normal informational output.

**-Z**, **--enable-errata**
> Apply errata workarounds for known TPM bugs.

**-T** _tcti_, **--tcti=**_tcti_
> Select the TCTI (Transmission Interface Configuration) used to talk to the TPM.

**-R**, **--autoflush**
> Automatically flush transient objects from the TPM when the tool exits.

# SUBCOMMAND CATEGORIES

**Entropy / hashing**: getrandom, hash, hmac, stirrandom
**Keys**: create, createprimary, createak, createek, load, loadexternal, import, evictcontrol
**PCRs**: pcrread, pcrextend, pcrevent, pcrreset, pcrallocate
**NV storage**: nvdefine, nvread, nvwrite, nvextend, nvundefine
**Sessions & policy**: startauthsession, policypcr, policysigned, policypassword, policyauthvalue
**Attestation**: quote, certify, activatecredential, makecredential
**Signing / encryption**: sign, verifysignature, rsaencrypt, rsadecrypt, encryptdecrypt
**Hierarchies**: clear, changeauth, dictionarylockout, hierarchycontrol

# TCTI SELECTION

Communication with the TPM is abstracted by a **TCTI**. Selection priority:

1. **-T** / **--tcti** on the command line
2. **TPM2TOOLS_TCTI** environment variable
3. Compile-time default

Common TCTIs:

```
tabrmd   Resource manager (tpm2-abrmd)
device   Direct /dev/tpm0 or /dev/tpmrm0
mssim    Microsoft TPM simulator (TCP)
swtpm    libtpms-based software TPM
none     Offline mode (no TPM required)
```

# EXIT CODES

**0**
> Success.

**1**
> General tool error.

**2**
> Option parsing error.

**3**
> Authentication failure.

**4**
> TCTI communication error.

**5**
> Unsupported scheme or algorithm.

# CAVEATS

Not every TPM exposes every hierarchy or PCR to userspace: only PCR 16 and 23 are typically resettable from locality 0, and certain operations require the owner password or a valid session. On systems using **tpm2-abrmd**, direct **device** access is blocked while the resource manager is running. When writing scripts, prefer the **tpm2 _tool_** form: it works even on minimal installs that only ship the dispatcher binary.

# HISTORY

The **tpm2-tools** project is maintained by the **tpm2-software** community and implements the user-space side of the **TCG TPM 2.0** specification on top of the **tpm2-tss** stack. The unified **tpm2** dispatcher was introduced to simplify packaging in constrained environments; the original per-tool invocation (**tpm2_**_tool_) is still supported and, on most distributions, remains the primary interface.

# SEE ALSO

[tpm2-abrmd](/man/tpm2-abrmd)(8), [tpm2_getrandom](/man/tpm2_getrandom)(1), [tpm2_pcrread](/man/tpm2_pcrread)(1), [tpm2_startup](/man/tpm2_startup)(1)
