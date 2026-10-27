# TAGLINE

Public gate in front of sponsord that serves deCDN installers

# TLDR

Start on **loopback** with a Turnstile gate and a pinned **decdn** release

```sponsord-onramp --public-url [https://onramp.example] --daemon-token-file [token] --rpc-url [https://sepolia-rollup.arbitrum.io/rpc] --capacity-bond [0xbond] --turnstile-sitekey [sitekey] --turnstile-secret-file [secret] --decdn-release [v0.2.0] --decdn-sums-sha256 [digest]```

Show **flags and defaults**

```sponsord-onramp --help```

# SYNOPSIS

**sponsord-onramp** [**--bind** _addr_] **--public-url** _url_ [**--daemon-url** _url_] (**--daemon-token** _token_ | **--daemon-token-file** _file_) **--rpc-url** _url_ **--capacity-bond** _addr_ [**--slash-judge** _addr_] [**--spending-cap** _n_] [**--ttl-secs** _n_] [**--gate** _turnstile_] [**--brand-name** _name_] [**--gate-template** _file_] [**--turnstile-secret** _secret_ | **--turnstile-secret-file** _file_] [**--turnstile-sitekey** _key_] [**--client-ip-header** _name_] [**--fund-rate-per-min** _n_] [**--poll-rate-per-min** _n_] [**--releases-base** _url_] **--decdn-release** _tag_ **--decdn-sums-sha256** _digest_

# DESCRIPTION

**sponsord-onramp** is the public HTTP process in front of a **sponsord** daemon. It serves the gate page, the **decdn.sh** and **decdn.ps1** installers, and the API those installers poll. A person who passes the gate receives a capability from **sponsord**; the installer then downloads **decdn** through the onramp.

The stock binary builds in a Cloudflare Turnstile gate. It loads configuration, checks the requested cap and TTL against the daemon, and listens until Ctrl-C or SIGTERM. Outbound calls to the daemon and to the gate time out after 10 seconds. Expired hand-offs are dropped from memory every 5 minutes.

Every flag has an environment variable: an ONRAMP prefix, the flag in uppercase, hyphens written as underscores. Three names are longer than the flag. **--capacity-bond** and **--slash-judge** append ADDR. **--spending-cap** is SPENDING CAP MICRO USDC. A secret may be given as a value or as a file (**--daemon-token-file**, **--turnstile-secret-file**).

Default listen address is **127.0.0.1:8080**. Default daemon URL is **http://127.0.0.1:8090**. Default gate is **turnstile**, and the default brand on the page is **deCDN**. Default release download base is **https://github.com/decdn**.

Signed Linux binaries are on the deCDN GitHub releases. A container image is published as **ghcr.io/decdn/sponsord-onramp**.

# PARAMETERS

**--bind** _addr_
> HTTP listen address. Default **127.0.0.1:8080**

**--public-url** _url_
> Base URL users use to reach this onramp. Baked into the installers and the gate links. Required. No query or fragment

**--daemon-url** _url_
> Base URL of the **sponsord** daemon. Default **http://127.0.0.1:8090**

**--daemon-token** _token_
> Bearer for the daemon API (its API token). One of this flag or **--daemon-token-file** is required

**--daemon-token-file** _file_
> File holding the daemon bearer, instead of **--daemon-token**

**--rpc-url** _url_
> Public JSON-RPC endpoint end users' **decdn** reads the chain through. Required. http or https

**--capacity-bond** _addr_
> CapacityBond contract address, handed to **decdn** for node discovery. Required

**--slash-judge** _addr_
> SlashJudge contract address, handed to **decdn** when set

**--spending-cap** _n_
> Cap requested for each capability, in micro-USDC. Unset uses the daemon's maximum. Must be above zero and no higher than that maximum

**--ttl-secs** _n_
> TTL requested for each capability, in seconds. Unset uses the daemon's maximum. Must be above zero and no higher than that maximum

**--gate** _kind_
> Gate a person must pass. **turnstile** (the default) or **custom**. This binary accepts only **turnstile**

**--brand-name** _name_
> Name shown on the gate page. Default **deCDN**

**--gate-template** _file_
> HTML file to serve as the gate page instead of the built-in page

**--turnstile-secret** _secret_
> Cloudflare Turnstile server-side secret. Required when the gate is **turnstile**, unless **--turnstile-secret-file** is set

**--turnstile-secret-file** _file_
> File holding the Turnstile secret, instead of **--turnstile-secret**

**--turnstile-sitekey** _key_
> Cloudflare Turnstile sitekey, shown on the gate page. Required when the gate is **turnstile**. Letters, digits, underscore, and hyphen only

**--client-ip-header** _name_
> Header a trusted reverse proxy puts the client address in, such as CF-Connecting-IP. Of a list, the right-most address counts. Unset uses the TCP peer

**--fund-rate-per-min** _n_
> **POST /v1/fund** requests allowed per client address per minute. Default **10**. **0** disables the limit

**--poll-rate-per-min** _n_
> **GET /v1/capability** polls allowed per client address per minute. The installer polls about every 2 seconds. Default **120**. **0** disables the limit

**--releases-base** _url_
> Base the installers download release binaries from, as **base/repo/releases/download/tag/**. Default **https://github.com/decdn**. Must be https, with no query or fragment

**--decdn-release** _tag_
> **decdn/decdn** release tag the installers install, shaped **vMAJOR.MINOR.PATCH** with an optional pre-release suffix. Required. Oldest accepted tag is **v0.2.0**

**--decdn-sums-sha256** _digest_
> SHA-256 of that release's SHA256SUMS file, 64 lowercase hex characters. Required. The installer checks the downloaded sums file against this digest, then each archive against the sums file

# CAVEATS

**--gate custom** is for programs that embed the crate with their own gate. This binary refuses it at startup.

The Turnstile sitekey and secret are required because the default gate is Turnstile. Prefer the file form of the secret and of the daemon bearer so they do not appear in a process listing.

**--public-url** and **--releases-base** are base URLs: no query and no fragment, and no character the installer scripts cannot quote (whitespace, quotes, backticks, dollar, backslash, braces). **--releases-base** must be https. **--rpc-url** may be http or https and has the same character limit.

**--decdn-release** below **v0.2.0**, including a pre-release of **0.2.0**, is refused. The installers run **decdn get** without an output path, which older clients reject. A spending cap or TTL of zero, or one above the daemon's maximum, fails once the daemon answers.

Set **--client-ip-header** only when every request comes through that one proxy. Otherwise rate limits key off a header a client can forge.

The onramp does not hold the treasury key. **sponsord** does. This process only asks that daemon for capabilities.

# HISTORY

**sponsord-onramp** is a crate in the **deCDN** repository (**decdn/decdn**), MIT or Apache-2.0. It is the public companion of the **sponsord** daemon and the **decdn** client.

# SEE ALSO

[sponsord](/man/sponsord)(8), [decdn](/man/decdn)(1), [decdn-node](/man/decdn-node)(8)

# RESOURCES

```[Source code](https://github.com/decdn/decdn)```

```[Homepage](https://decdn.org)```

```[Documentation](https://github.com/decdn/decdn/blob/main/docs/sponsord/operator.md)```

<!-- verified: 2026-10-27 -->
