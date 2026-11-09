# TAGLINE

Email API CLI for sending emails and managing webhooks

# TLDR

**Authenticate** with your Resend account

```resend login```

**Send an email** with subject and body

```resend emails send --from [sender@example.com] --to [recipient@example.com] --subject "[Hello]" --text "[Message body]"```

**Check API key** and verify domain readiness

```resend doctor```

**Start a local webhook** listener through a public tunnel

```resend webhooks listen --url [https://xxxx.ngrok-free.app]```

**Forward webhook events** to a local app

```resend webhooks listen --url [https://xxxx.ngrok-free.app] --forward-to [localhost:3000/api/webhooks]```

**Create a webhook** for production events

```resend webhooks create --endpoint [https://app.example.com/hooks/resend] --events [all]```

**Validate an email** without sending it

```resend emails send --from [sender@example.com] --to [recipient@example.com] --subject "[Hello]" --text "[Body]" --dry-run```

**Use a named profile** for one command

```resend --profile [production] domains list```

**Send an email** with HTML body

```resend emails send --from [sender@example.com] --to [recipient@example.com] --subject "[Hello]" --html "[<h1>Hello</h1>]"```

# SYNOPSIS

**resend** [_global options_] _command_ [_options_]

# PARAMETERS

**login**
> Store an API key locally after validating it. Prompts for the key in a terminal; use **--web** for browser login or **--key** in non-interactive mode.

**doctor**
> Check the CLI version, API key, and domains, and detect AI agent integrations.

**emails send**
> Send an email with specified sender, recipient, subject, and body.

**webhooks listen**
> Start a local server (default port 4318), register a temporary webhook at the public tunnel given by **--url**, print events in the terminal, and delete the webhook on exit.

**webhooks create**
> Register a new webhook endpoint for production environments.

**--from** _address_
> Sender email address.

**--to** _address_
> One or more recipient email addresses (space-separated).

**--subject** _text_
> Email subject line.

**--text** _body_
> Plain text email body.

**--html** _body_
> HTML email body.

**--html-file** _path_
> Path to an HTML file to use as the body.

**--cc**, **--bcc** _addresses_
> CC and BCC recipients (space-separated).

**--reply-to** _address_
> Reply-to email address.

**--dry-run**
> Validate and print the payload without calling the API (**emails send**, **emails batch**, **broadcasts create**).

**--url** _url_
> Public tunnel URL that reaches this machine (required by **webhooks listen**).

**--port** _port_
> Local port for **webhooks listen** (default: 4318).

**--endpoint** _url_
> HTTPS URL that receives webhook POSTs (**webhooks create**).

**--events** _events_
> Event names to subscribe to, or `all`.

**--forward-to** _url_
> Also POST each webhook payload to this URL, preserving Svix signature headers.

**--api-key** _key_
> Override the API key for this invocation (global option).

**-p**, **--profile** _name_
> Profile to use (global option).

**--json**
> Force JSON output (global option).

**-q**, **--quiet**
> Suppress spinners and status output; implies **--json** (global option).

**--version**
> Show version information.

**--help**
> Show available commands and options.

# DESCRIPTION

**resend** is the official CLI for the Resend email API. It enables sending transactional emails, managing webhooks, and diagnosing account configuration directly from the terminal. The CLI is designed for developers, CI/CD pipelines, and AI agent workflows.

In non-interactive mode, output is formatted as JSON with consistent exit codes, making it suitable for scripting and automation. Errors include structured **message** and **code** fields for programmatic handling.

The webhook listener (**resend webhooks listen**) creates a local development server that captures incoming events and streams them to the terminal, useful for testing email event handlers without deploying to production.

# CAVEATS

Requires a Resend account and API key for authentication. Sending emails requires a verified domain. The API key is resolved from **--api-key**, then **RESEND_API_KEY**, then the stored login. The webhook listener needs a public tunnel, such as **ngrok**, that forwards to its local port. The CLI outputs JSON in non-interactive mode but human-readable text in interactive mode.

# HISTORY

**Resend** was founded by **Zeno Rocha** as a modern email API for developers, offering an alternative to legacy transactional email services. The CLI was built to complement the REST API and SDKs, providing terminal-based access to all core email operations. It is written in **TypeScript** and distributed via npm and Homebrew.

# SEE ALSO

[mail](/man/mail)(1), [sendmail](/man/sendmail)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/resend/resend-cli)```

```[Homepage](https://resend.com)```

```[Documentation](https://resend.com/docs/cli)```

<!-- verified: 2026-11-09 -->
