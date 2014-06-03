/**
 * Copyright (c) 2013 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.impl;

import java.util.GregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFHeader;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Req IF Header</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFHeaderImpl#getComment <em>Comment</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFHeaderImpl#getCreationTime <em>Creation Time</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFHeaderImpl#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFHeaderImpl#getRepositoryId <em>Repository Id</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFHeaderImpl#getReqIFToolId <em>Req IF Tool Id</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFHeaderImpl#getReqIFVersion <em>Req IF Version</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFHeaderImpl#getSourceToolId <em>Source Tool Id</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFHeaderImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ReqIFHeaderImpl extends MinimalEObjectImpl implements ReqIFHeader {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * This is true if the Comment attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean commentESet;

	/**
	 * The default value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected static final GregorianCalendar CREATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected GregorianCalendar creationTime = CREATION_TIME_EDEFAULT;

	/**
	 * This is true if the Creation Time attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean creationTimeESet;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * This is true if the Identifier attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean identifierESet;

	/**
	 * The default value of the '{@link #getRepositoryId() <em>Repository Id</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRepositoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepositoryId() <em>Repository Id</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRepositoryId()
	 * @generated
	 * @ordered
	 */
	protected String repositoryId = REPOSITORY_ID_EDEFAULT;

	/**
	 * This is true if the Repository Id attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean repositoryIdESet;

	/**
	 * The default value of the '{@link #getReqIFToolId() <em>Req IF Tool Id</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReqIFToolId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQ_IF_TOOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReqIFToolId() <em>Req IF Tool Id</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReqIFToolId()
	 * @generated
	 * @ordered
	 */
	protected String reqIFToolId = REQ_IF_TOOL_ID_EDEFAULT;

	/**
	 * This is true if the Req IF Tool Id attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean reqIFToolIdESet;

	/**
	 * The default value of the '{@link #getReqIFVersion() <em>Req IF Version</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReqIFVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String REQ_IF_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReqIFVersion() <em>Req IF Version</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReqIFVersion()
	 * @generated
	 * @ordered
	 */
	protected String reqIFVersion = REQ_IF_VERSION_EDEFAULT;

	/**
	 * This is true if the Req IF Version attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean reqIFVersionESet;

	/**
	 * The default value of the '{@link #getSourceToolId() <em>Source Tool Id</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceToolId()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_TOOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceToolId() <em>Source Tool Id</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceToolId()
	 * @generated
	 * @ordered
	 */
	protected String sourceToolId = SOURCE_TOOL_ID_EDEFAULT;

	/**
	 * This is true if the Source Tool Id attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean sourceToolIdESet;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * This is true if the Title attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean titleESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReqIFHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqIF10Package.Literals.REQ_IF_HEADER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		boolean oldCommentESet = commentESet;
		commentESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.REQ_IF_HEADER__COMMENT, oldComment, comment, !oldCommentESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetComment() {
		String oldComment = comment;
		boolean oldCommentESet = commentESet;
		comment = COMMENT_EDEFAULT;
		commentESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.REQ_IF_HEADER__COMMENT, oldComment, COMMENT_EDEFAULT,
					oldCommentESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetComment() {
		return commentESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GregorianCalendar getCreationTime() {
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCreationTime(GregorianCalendar newCreationTime) {
		GregorianCalendar oldCreationTime = creationTime;
		creationTime = newCreationTime;
		boolean oldCreationTimeESet = creationTimeESet;
		creationTimeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.REQ_IF_HEADER__CREATION_TIME, oldCreationTime, creationTime,
					!oldCreationTimeESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetCreationTime() {
		GregorianCalendar oldCreationTime = creationTime;
		boolean oldCreationTimeESet = creationTimeESet;
		creationTime = CREATION_TIME_EDEFAULT;
		creationTimeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.REQ_IF_HEADER__CREATION_TIME, oldCreationTime,
					CREATION_TIME_EDEFAULT, oldCreationTimeESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetCreationTime() {
		return creationTimeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		boolean oldIdentifierESet = identifierESet;
		identifierESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.REQ_IF_HEADER__IDENTIFIER, oldIdentifier, identifier,
					!oldIdentifierESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetIdentifier() {
		String oldIdentifier = identifier;
		boolean oldIdentifierESet = identifierESet;
		identifier = IDENTIFIER_EDEFAULT;
		identifierESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.REQ_IF_HEADER__IDENTIFIER, oldIdentifier, IDENTIFIER_EDEFAULT,
					oldIdentifierESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetIdentifier() {
		return identifierESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getRepositoryId() {
		return repositoryId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRepositoryId(String newRepositoryId) {
		String oldRepositoryId = repositoryId;
		repositoryId = newRepositoryId;
		boolean oldRepositoryIdESet = repositoryIdESet;
		repositoryIdESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.REQ_IF_HEADER__REPOSITORY_ID, oldRepositoryId, repositoryId,
					!oldRepositoryIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetRepositoryId() {
		String oldRepositoryId = repositoryId;
		boolean oldRepositoryIdESet = repositoryIdESet;
		repositoryId = REPOSITORY_ID_EDEFAULT;
		repositoryIdESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.REQ_IF_HEADER__REPOSITORY_ID, oldRepositoryId,
					REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetRepositoryId() {
		return repositoryIdESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getReqIFToolId() {
		return reqIFToolId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReqIFToolId(String newReqIFToolId) {
		String oldReqIFToolId = reqIFToolId;
		reqIFToolId = newReqIFToolId;
		boolean oldReqIFToolIdESet = reqIFToolIdESet;
		reqIFToolIdESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.REQ_IF_HEADER__REQ_IF_TOOL_ID, oldReqIFToolId, reqIFToolId,
					!oldReqIFToolIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetReqIFToolId() {
		String oldReqIFToolId = reqIFToolId;
		boolean oldReqIFToolIdESet = reqIFToolIdESet;
		reqIFToolId = REQ_IF_TOOL_ID_EDEFAULT;
		reqIFToolIdESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.REQ_IF_HEADER__REQ_IF_TOOL_ID, oldReqIFToolId,
					REQ_IF_TOOL_ID_EDEFAULT, oldReqIFToolIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetReqIFToolId() {
		return reqIFToolIdESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getReqIFVersion() {
		return reqIFVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReqIFVersion(String newReqIFVersion) {
		String oldReqIFVersion = reqIFVersion;
		reqIFVersion = newReqIFVersion;
		boolean oldReqIFVersionESet = reqIFVersionESet;
		reqIFVersionESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.REQ_IF_HEADER__REQ_IF_VERSION, oldReqIFVersion, reqIFVersion,
					!oldReqIFVersionESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetReqIFVersion() {
		String oldReqIFVersion = reqIFVersion;
		boolean oldReqIFVersionESet = reqIFVersionESet;
		reqIFVersion = REQ_IF_VERSION_EDEFAULT;
		reqIFVersionESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.REQ_IF_HEADER__REQ_IF_VERSION, oldReqIFVersion,
					REQ_IF_VERSION_EDEFAULT, oldReqIFVersionESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetReqIFVersion() {
		return reqIFVersionESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSourceToolId() {
		return sourceToolId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceToolId(String newSourceToolId) {
		String oldSourceToolId = sourceToolId;
		sourceToolId = newSourceToolId;
		boolean oldSourceToolIdESet = sourceToolIdESet;
		sourceToolIdESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.REQ_IF_HEADER__SOURCE_TOOL_ID, oldSourceToolId, sourceToolId,
					!oldSourceToolIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetSourceToolId() {
		String oldSourceToolId = sourceToolId;
		boolean oldSourceToolIdESet = sourceToolIdESet;
		sourceToolId = SOURCE_TOOL_ID_EDEFAULT;
		sourceToolIdESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.REQ_IF_HEADER__SOURCE_TOOL_ID, oldSourceToolId,
					SOURCE_TOOL_ID_EDEFAULT, oldSourceToolIdESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetSourceToolId() {
		return sourceToolIdESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		boolean oldTitleESet = titleESet;
		titleESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.REQ_IF_HEADER__TITLE, oldTitle, title, !oldTitleESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetTitle() {
		String oldTitle = title;
		boolean oldTitleESet = titleESet;
		title = TITLE_EDEFAULT;
		titleESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.REQ_IF_HEADER__TITLE, oldTitle, TITLE_EDEFAULT, oldTitleESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetTitle() {
		return titleESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReqIF10Package.REQ_IF_HEADER__COMMENT:
			return getComment();
		case ReqIF10Package.REQ_IF_HEADER__CREATION_TIME:
			return getCreationTime();
		case ReqIF10Package.REQ_IF_HEADER__IDENTIFIER:
			return getIdentifier();
		case ReqIF10Package.REQ_IF_HEADER__REPOSITORY_ID:
			return getRepositoryId();
		case ReqIF10Package.REQ_IF_HEADER__REQ_IF_TOOL_ID:
			return getReqIFToolId();
		case ReqIF10Package.REQ_IF_HEADER__REQ_IF_VERSION:
			return getReqIFVersion();
		case ReqIF10Package.REQ_IF_HEADER__SOURCE_TOOL_ID:
			return getSourceToolId();
		case ReqIF10Package.REQ_IF_HEADER__TITLE:
			return getTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ReqIF10Package.REQ_IF_HEADER__COMMENT:
			setComment((String) newValue);
			return;
		case ReqIF10Package.REQ_IF_HEADER__CREATION_TIME:
			setCreationTime((GregorianCalendar) newValue);
			return;
		case ReqIF10Package.REQ_IF_HEADER__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ReqIF10Package.REQ_IF_HEADER__REPOSITORY_ID:
			setRepositoryId((String) newValue);
			return;
		case ReqIF10Package.REQ_IF_HEADER__REQ_IF_TOOL_ID:
			setReqIFToolId((String) newValue);
			return;
		case ReqIF10Package.REQ_IF_HEADER__REQ_IF_VERSION:
			setReqIFVersion((String) newValue);
			return;
		case ReqIF10Package.REQ_IF_HEADER__SOURCE_TOOL_ID:
			setSourceToolId((String) newValue);
			return;
		case ReqIF10Package.REQ_IF_HEADER__TITLE:
			setTitle((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ReqIF10Package.REQ_IF_HEADER__COMMENT:
			unsetComment();
			return;
		case ReqIF10Package.REQ_IF_HEADER__CREATION_TIME:
			unsetCreationTime();
			return;
		case ReqIF10Package.REQ_IF_HEADER__IDENTIFIER:
			unsetIdentifier();
			return;
		case ReqIF10Package.REQ_IF_HEADER__REPOSITORY_ID:
			unsetRepositoryId();
			return;
		case ReqIF10Package.REQ_IF_HEADER__REQ_IF_TOOL_ID:
			unsetReqIFToolId();
			return;
		case ReqIF10Package.REQ_IF_HEADER__REQ_IF_VERSION:
			unsetReqIFVersion();
			return;
		case ReqIF10Package.REQ_IF_HEADER__SOURCE_TOOL_ID:
			unsetSourceToolId();
			return;
		case ReqIF10Package.REQ_IF_HEADER__TITLE:
			unsetTitle();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ReqIF10Package.REQ_IF_HEADER__COMMENT:
			return isSetComment();
		case ReqIF10Package.REQ_IF_HEADER__CREATION_TIME:
			return isSetCreationTime();
		case ReqIF10Package.REQ_IF_HEADER__IDENTIFIER:
			return isSetIdentifier();
		case ReqIF10Package.REQ_IF_HEADER__REPOSITORY_ID:
			return isSetRepositoryId();
		case ReqIF10Package.REQ_IF_HEADER__REQ_IF_TOOL_ID:
			return isSetReqIFToolId();
		case ReqIF10Package.REQ_IF_HEADER__REQ_IF_VERSION:
			return isSetReqIFVersion();
		case ReqIF10Package.REQ_IF_HEADER__SOURCE_TOOL_ID:
			return isSetSourceToolId();
		case ReqIF10Package.REQ_IF_HEADER__TITLE:
			return isSetTitle();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comment: "); //$NON-NLS-1$
		if (commentESet) {
			result.append(comment);
		} else {
			result.append("<unset>"); //$NON-NLS-1$
		}
		result.append(", creationTime: "); //$NON-NLS-1$
		if (creationTimeESet) {
			result.append(creationTime);
		} else {
			result.append("<unset>"); //$NON-NLS-1$
		}
		result.append(", identifier: "); //$NON-NLS-1$
		if (identifierESet) {
			result.append(identifier);
		} else {
			result.append("<unset>"); //$NON-NLS-1$
		}
		result.append(", repositoryId: "); //$NON-NLS-1$
		if (repositoryIdESet) {
			result.append(repositoryId);
		} else {
			result.append("<unset>"); //$NON-NLS-1$
		}
		result.append(", reqIFToolId: "); //$NON-NLS-1$
		if (reqIFToolIdESet) {
			result.append(reqIFToolId);
		} else {
			result.append("<unset>"); //$NON-NLS-1$
		}
		result.append(", reqIFVersion: "); //$NON-NLS-1$
		if (reqIFVersionESet) {
			result.append(reqIFVersion);
		} else {
			result.append("<unset>"); //$NON-NLS-1$
		}
		result.append(", sourceToolId: "); //$NON-NLS-1$
		if (sourceToolIdESet) {
			result.append(sourceToolId);
		} else {
			result.append("<unset>"); //$NON-NLS-1$
		}
		result.append(", title: "); //$NON-NLS-1$
		if (titleESet) {
			result.append(title);
		} else {
			result.append("<unset>"); //$NON-NLS-1$
		}
		result.append(')');
		return result.toString();
	}

} // ReqIFHeaderImpl
