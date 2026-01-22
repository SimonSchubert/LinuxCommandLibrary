# TLDR

**Show** resources for an application

```appres [XTerm]```

Show resources with **class**

```appres [XTerm] [xterm]```

Show **specific resource**

```appres [Emacs] | grep [font]```

# SYNOPSIS

**appres** [_class_] [_instance_]

# DESCRIPTION

**appres** displays X application resources. It queries the X Resource Manager database and shows resources that would be applied to a specified application based on its class and instance names.

This is useful for debugging X11 application appearance and behavior, understanding which resources are being applied.

# PARAMETERS

**class**
> Application class name (typically capitalized)

**instance**
> Application instance name

# CAVEATS

Only applies to X11 applications using Xlib resources. Modern toolkit applications (GTK, Qt) may not use X resources. Output depends on resources defined in .Xresources or .Xdefaults.

# HISTORY

**appres** is a standard X11 utility that has been part of the X Window System since the X11R4 release in **1989**.

# SEE ALSO

[xrdb](/man/xrdb)(1), [xprop](/man/xprop)(1), [editres](/man/editres)(1)
