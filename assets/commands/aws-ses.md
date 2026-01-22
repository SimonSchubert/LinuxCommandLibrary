# TLDR

**Send an email** with subject and body

```aws ses send-email --from [sender@example.com] --to [recipient@example.com] --subject "[Subject]" --text "[Body text]"```

**Verify an email identity**

```aws ses verify-email-identity --email-address [email@example.com]```

**List verified identities**

```aws ses list-identities```

**Get sending quota** and limits

```aws ses get-send-quota```

**Get sending statistics**

```aws ses get-send-statistics```

**Create an email template**

```aws ses create-template --template file://[template.json]```

**Send a templated email**

```aws ses send-templated-email --source [sender@example.com] --destination ToAddresses=[recipient@example.com] --template [template-name] --template-data '{"name":"value"}'```

# SYNOPSIS

**aws ses** _subcommand_ [_options_]

# DESCRIPTION

**aws ses** is the AWS CLI interface for Amazon Simple Email Service (SES), a cloud-based email sending service for transactional email, marketing messages, and high-volume email communications.

SES provides email sending capabilities with features like deliverability tracking, bounce and complaint handling, email templates, and configuration sets for managing sending behavior.

# SUBCOMMANDS

**Email Sending**
> send-email, send-raw-email, send-templated-email, send-bulk-templated-email, send-bounce, send-custom-verification-email

**Identity Verification**
> verify-email-identity, verify-domain-identity, verify-domain-dkim, delete-identity, list-identities, get-identity-verification-attributes

**Templates**
> create-template, get-template, update-template, delete-template, list-templates, test-render-template

**Configuration Sets**
> create-configuration-set, describe-configuration-set, delete-configuration-set, list-configuration-sets

**Receipt Rules**
> create-receipt-rule, describe-receipt-rule, update-receipt-rule, delete-receipt-rule, list-receipt-rule-sets

**Statistics**
> get-send-quota, get-send-statistics, get-account-sending-enabled

# CAVEATS

New SES accounts start in sandbox mode, which limits sending to verified email addresses only. Request production access to send to any address. Email identities (addresses or domains) must be verified before sending. SES charges per 1,000 emails sent plus data transfer fees.

# HISTORY

Amazon SES launched in **January 2011** as AWS's email sending service, providing developers with a cost-effective way to send email at scale. The service has evolved to include receiving capabilities, templates, and advanced deliverability features.

# SEE ALSO

[aws](/man/aws)(1), [sendmail](/man/sendmail)(1), [mail](/man/mail)(1)
