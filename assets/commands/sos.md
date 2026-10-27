# TAGLINE

Collect system logs and other debug information into one archive

# TLDR

**Collect** a standard report

```sudo sos report```

**Unattended** report with a label

```sudo sos report --batch --label [case-42]```

Attach a **case id**

```sudo sos report --case-id [123456]```

**List** plugins

```sudo sos report --list-plugins```

Keep **full** logs and journals

```sudo sos report --all-logs```

**Upload** the archive when it is built

```sudo sos report --upload```

**Obfuscate** secrets in an existing archive

```sudo sos clean```

# SYNOPSIS

**sos** _component_ [_options_]

# COMPONENTS

**report**
> Collect logs, configuration, and command output into one archive. Alias **rep**.

**collect**
> Run a report across hosts. **sos collector** is the same component. The standalone **sos-collector** name is deprecated.

**clean**
> Obfuscate secrets in an archive before you share it. Aliases **cleaner** and **mask**. **sos report** and **sos collect** accept **--clean**, **--cleaner**, and **--mask** for the same pass.

**upload**
> Upload an existing archive.

**help**
> Help for a component.

# PARAMETERS

**--batch**
> Do not prompt. With **--encrypt**, the passphrase or key is taken from the environment (see below).

**--encrypt**
> Encrypt the finished archive. Without **--batch**, sos asks: passphrase, key, environment, or no encryption. With **--batch**, **SOSENCRYPTKEY** selects a GPG recipient and **SOSENCRYPTPASS** selects a passphrase. A key wins when both are set.

**--encrypt-key** _KEY_
> Encrypt to a GPG recipient that is already in the keyring. The user who runs sos must own that keyring. Encryption uses about twice the temporary disk space of the archive; the unencrypted copy is removed after success.

**--encrypt-pass** _PASS_
> Symmetric passphrase encryption.

**--config-file** _CONFIG_
> Use this configuration file instead of the defaults.

**-s**, **--sysroot** _SYSROOT_
> Collect from a system mounted at this path.

**--tmp-dir** _DIRECTORY_
> Write the archive and temporary files here.

**--threads** _THREADS_
> Worker threads. The default is **4**.

**-v**, **--verbose**
> Repeat for more detail. One **-v** logs debug information and plugin starts to **sos.log**. A second also prints that on the console. A third logs archive file operations.

**-q**, **--quiet**
> Less console output.

**-z**, **--compression-type** _auto_|_xz_|_gzip_|_none_
> How the archive is compressed. The default is **auto**.

# REPORT OPTIONS

**-l**, **--list-plugins**
> Print the plugins and exit.

**-n**, **--skip-plugins** _PLUGINS_
> Skip these plugins (comma-separated).

**-e**, **--enable-plugins** _PLUGINS_
> Enable plugins that are off by default. When a profile is selected with **-p**, this does not add further plugins; use **-o** to extend a profile.

**-o**, **--only-plugins** _PLUGINS_
> Run only these plugins.

**-k**, **--plugin-option** _NAME.OPTION[=VALUE]_
> Set one plugin option. Repeat for several. A per-plugin timeout such as **logs.timeout=600** overrides **--plugin-timeout**.

**-p**, **--profile** _NAME_
> Use a named profile. **--list-profiles** prints them.

**--label** _LABEL_
> Store a short label in the archive.

**--case-id** _NUMBER_
> Attach a support case id.

**--all-logs**
> Ignore log and journal size limits, including the limit set by **--journal-size**. The archive can grow very large.

**--since** _YYYYMMDD[HHMMSS]_
> Limit collected journal and command history to this time and later.

**--plugin-timeout** _TIMEOUT_
> Seconds for each plugin. **0** means no limit.

**--estimate-only**
> Estimate the report and do not write an archive.

**--dry-run**
> Show what would be collected.

**--upload**
> Upload after the report is built. **--upload-url**, **--upload-user**, **--upload-pass**, **--upload-directory**, **--upload-method**, **--upload-protocol**, and **--upload-no-ssl-verify** choose the destination. S3 uploads add **--upload-s3-endpoint**, **--upload-s3-region**, **--upload-s3-bucket**, **--upload-s3-access-key**, **--upload-s3-secret-key**, **--upload-s3-object-prefix**, and **--upload-threads**.

**--preset** _NAME_
> Apply a saved option set. **--list-presets** prints them. **--add-preset** and **--del-preset** edit the set.

# DESCRIPTION

**sos** is the command from the sosreport project. **sos report** walks plugins that copy configuration, command output, and logs into a compressed archive you can hand to a support engineer. It is normally run as root so those plugins can read protected files.

**sos collect** drives the same report on one or more remote hosts. **sos clean** rewrites an archive so hostnames, IP addresses, and other secrets are masked before it is shared. **sos upload** sends an archive that already exists.

Bash completion is installed at **/usr/share/bash-completion/completions/sos**.

# CONFIGURATION

**/etc/sos/sos.conf**

> System-wide options. A user file at **$HOME/.config/sos/sos.conf** overrides it for components that allow a non-root run. Presets override the files. Command-line flags override presets.

Host groups for **sos collect** live under **/etc/sos/groups.d/**. A same-named file in **$HOME/.config/sos/groups.d/** wins. Presets live under **/etc/sos/presets.d/**.

# CAVEATS

The archive contains configuration and logs from the machine. Run **sos clean** before sending it anywhere you would not send those files. **--all-logs** can make the archive enormous. If encryption fails, sos keeps the original unencrypted archive. The GPG keyring must belong to the account that runs sos, which matters under sudo.

# HISTORY

**sos** is maintained by the sosreport project. The component manual pages are **sos-report**, **sos-collect**, **sos-clean**, and **sos.conf**.

# INSTALL

```apt: sudo apt install sos```

```dnf: sudo dnf install sos```

```aur: yay -S sos```

```nix: nix profile install nixpkgs#sosreport```

<!-- packages: 2026-10-27 -->

# SEE ALSO

[journalctl](/man/journalctl)(1), [dmesg](/man/dmesg)(1), [inxi](/man/inxi)(1)

# RESOURCES

```[Source code](https://github.com/sosreport/sos)```

<!-- verified: 2026-10-27 -->
