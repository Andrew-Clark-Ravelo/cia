/*
 * Copyright 2010 James Pether Sörling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
package com.hack23.cia.service.data.impl;

import java.util.List;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hack23.cia.service.data.api.DocumentStatusContainerDAO;

/**
 * The Class DocumentStatusContainerDAOITest.
 */
@PerfTest(threads = 1, duration = 3000, warmUp = 1500)
@Required(max = 1200,average = 600,percentile95=700,throughput=2)
public final class DocumentStatusContainerDAOITest extends AbstractServiceDataFunctionalIntegrationTest {

	/** The i. */
	@Rule
	public ContiPerfRule i = new ContiPerfRule();

	/** The document status container DAO. */
	@Autowired
	private DocumentStatusContainerDAO documentStatusContainerDAO;


	/**
	 * Check exist by document id test.
	 */
	@Test
	public void checkExistByDocumentIdTest() {
		assertEquals(1,documentStatusContainerDAO.checkExistByDocumentId("H501UbU4"));
	}

	/**
	 * Gets the avaible committee proposal test.
	 *
	 * @return the avaible committee proposal test
	 */
	@Test
	public void getAvaibleCommitteeProposalTest() {
		List<String> idList = documentStatusContainerDAO.getAvaibleCommitteeProposal();
		assertNotNull(idList);
		assertFalse(idList.isEmpty());
	}


	/**
	 * Gets the id list test.
	 *
	 * @return the id list test
	 */
	@Test
	public void getIdListTest() {
		List<String> idList = documentStatusContainerDAO.getIdList();
		assertNotNull(idList);
		assertFalse(idList.isEmpty());
	}

}
