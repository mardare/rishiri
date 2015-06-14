


<c:choose>
	<c:when test="${isDSM eq true && securityType eq 'UCR' and empty securityTypeCCR}">
		<span class="sign-value">${dsmSignatureFields[1].displayValue}</span>
	</c:when>
	<c:otherwise>
		<span class="sign-value">IBAN: <%= Highlighter.highlightChallenge(utb.getContext(), EbUtils.formatIban(pAccBase), pAccBase, null , "FFFFFF") %></span>
		<span class="sign-value"><%= Highlighter.highlightChallenge(utb.getContext(), pName, pName, null , "FFFFFF") %></span>
	</c:otherwise>
</c:choose>





