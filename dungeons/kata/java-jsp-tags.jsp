


<c:choose>
	<c:when test="${isD eq true && securityType eq 'UC'}">
		<span class="sign-value">${dSignatureFields[1].displayValue}</span>
	</c:when>
	<c:otherwise>
		<span class="sign-value">IBAN: <%= Highlighter.highlightChallenge(utb.getContext(), EUtils.formatIban(pAccBase), pAccBase, null , "FFFFFF") %></span>
		<span class="sign-value"><%= Highlighter.highlightChallenge(utb.getContext(), pName, pName, null , "FFFFFF") %></span>
	</c:otherwise>
</c:choose>





