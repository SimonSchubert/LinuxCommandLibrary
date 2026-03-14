# TAGLINE

Deploy Sailfish apps to devices or emulators

# TLDR

**Deploy application to device**

```sfdk deploy```

**Deploy with manual method**

```sfdk deploy --manual```

**Deploy with zypper dup method**

```sfdk deploy --zypper-dup```

**Preview deployment without applying**

```sfdk deploy --dry-run```

# SYNOPSIS

**sfdk deploy** [_options_]

# PARAMETERS

**--sdk**
> Deploy via SDK connection.

**--manual**
> Manual deployment (copy RPMs and install).

**--rsync**
> Use rsync for deployment.

**--zypper-dup**
> Deploy using zypper distribution upgrade.

**--dry-run**
> Preview deployment without actually applying changes.

# DESCRIPTION

**sfdk deploy** deploys built Sailfish OS application packages to devices or emulators previously registered within the Sailfish IDE. It always deploys the latest built version found in the output directory while obeying package dependencies. Multiple deployment methods are available depending on the target setup.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-prepare](/man/sfdk-prepare)(1), [sfdk-undeploy](/man/sfdk-undeploy)(1)

