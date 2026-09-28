# TAGLINE

checks if websites are accessible

# TLDR

**Check if site is up**

```is-up [example.com]```

Use the **exit code** in a script (0 = up, 2 = down)

```is-up [example.com] && echo "online"```

# SYNOPSIS

**is-up** _url_

# PARAMETERS

_URL_
> Website URL or domain to check. A missing http:// scheme is added automatically.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**is-up** checks whether a website is up or down, printing **Up** or **Down**. Instead of connecting to the site directly, it queries the third-party **isitup.org** API, so the check is performed from an external location rather than your own network.

It exits with code **0** if the site is up, **2** if it is down, and **1** on usage errors, making it usable in scripts. It is installed from npm as **is-up-cli**.

# CAVEATS

Only the first URL argument is checked. Results depend entirely on the availability of the isitup.org service, which has been unreliable and returned errors when last checked; if it is unreachable the command fails. Only the hostname is checked, not the specific path. The project has not been updated since 2022.

# HISTORY

is-up-cli was created by **Sindre Sorhus** as a thin command-line wrapper around his **is-up** Node.js module.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [ping](/man/ping)(8), [http](/man/http)(1)

# RESOURCES

```[Source code](https://github.com/sindresorhus/is-up-cli)```

<!-- verified: 2026-09-29 -->
