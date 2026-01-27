# TLDR

**Set root password**

```virt-customize -a [image.qcow2] --root-password password:[newpass]```

**Install packages**

```virt-customize -a [image.qcow2] --install [nginx,vim]```

**Upload file to image**

```virt-customize -a [image.qcow2] --upload [local.conf]:[/etc/app.conf]```

**Run shell script**

```virt-customize -a [image.qcow2] --run [setup.sh]```

**Run command**

```virt-customize -a [image.qcow2] --run-command "[systemctl enable nginx]"```

**Inject SSH key**

```virt-customize -a [image.qcow2] --ssh-inject [root]:file:[~/.ssh/id_rsa.pub]```

**Set timezone**

```virt-customize -a [image.qcow2] --timezone [America/New_York]```

**Set hostname**

```virt-customize -a [image.qcow2] --hostname [myserver]```

# SYNOPSIS

**virt-customize** **-a** _image_ [_options_]

# PARAMETERS

**-a**, **--add** _file_
> Disk image file to customize.

**--root-password** _method:arg_
> Set root password.

**--password** _user:method:arg_
> Set user password.

**--install** _packages_
> Install packages (comma-separated).

**--uninstall** _packages_
> Remove packages.

**--update**
> Update all packages.

**--upload** _local:remote_
> Upload file to image.

**--copy-in** _local:remotedir_
> Copy files/dirs into image.

**--run** _script_
> Run shell script in image.

**--run-command** _cmd_
> Run single command.

**--ssh-inject** _user:file:keyfile_
> Inject SSH public key.

**--timezone** _tz_
> Set timezone.

**--hostname** _name_
> Set hostname.

**--edit** _file:expr_
> Edit file with Perl expression.

**--delete** _path_
> Delete file or directory.

**--commands-from-file** _file_
> Read commands from file.

**-v**, **--verbose**
> Enable verbose output.

# DESCRIPTION

**virt-customize** modifies virtual machine disk images by installing packages, editing configuration, uploading files, and running scripts. It is part of the libguestfs tools suite.

The tool works by mounting the disk image using libguestfs and performing operations in a secure, isolated environment. The VM must be shut down before customization.

Customization scripts run inside a small appliance chrooted into the guest filesystem. Limited network access is available for package downloads.

This tool is useful for preparing cloud images, creating golden images, and automating VM provisioning.

# CAVEATS

VM must be shut down. Don't run as root unless necessary. Snapshot disk before modifying production images. Some operations require specific guest OS support. SELinux relabeling may be needed.

# HISTORY

**virt-customize** is part of libguestfs, created by Red Hat for virtual machine image manipulation. The toolset provides safe, scriptable access to VM disk images without requiring the guest to be running.

# SEE ALSO

[virt-sysprep](/man/virt-sysprep)(1), [virt-builder](/man/virt-builder)(1), [guestfish](/man/guestfish)(1), [guestmount](/man/guestmount)(1)
