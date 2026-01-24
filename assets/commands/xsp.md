# TLDR

**Start server**

```xsp```

**Specify port**

```xsp --port [8080]```

**Set root directory**

```xsp --root [/var/www]```

**Enable HTTPS**

```xsp --https --p12file [server.p12] --pkpwd [password]```

**Run ASP.NET 4**

```xsp4```

**Bind to address**

```xsp --address [0.0.0.0]```

# SYNOPSIS

**xsp** [_--port port_] [_--root path_] [_--address ip_] [_--https_] [_options_]

# PARAMETERS

**--port** _PORT_
> Listen port (default 8080).

**--root** _PATH_
> Application root directory.

**--address** _IP_
> Bind address.

**--https**
> Enable HTTPS.

**--p12file** _FILE_
> PKCS#12 certificate file.

**--pkpwd** _PASSWORD_
> Certificate password.

**--nonstop**
> Don't stop on ENTER.

# DESCRIPTION

**xsp** is Mono's ASP.NET web server. It hosts .NET web apps.

Standalone server. Development use.

ASP.NET hosting. WebForms, MVC.

HTTPS support. Certificate based.

Lightweight. Testing focused.

# CAVEATS

Development server. Mono required. Use with mod_mono for production.

# HISTORY

**xsp** is part of the **Mono** project, providing a standalone ASP.NET web server for testing and development on Linux.

# SEE ALSO

[mono](/man/mono)(1), [mcs](/man/mcs)(1), [apache2](/man/apache2)(1)
